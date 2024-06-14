package screenmatch.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


import screenmatch.model.DataEpisode;
import screenmatch.model.DataSeason;
import screenmatch.model.DataSeries;
import screenmatch.service.ConsumeApi;
import screenmatch.service.ConvertData;

public class Main {


        private final String ADDRESS = "https://www.omdbapi.com/?t=";
        private final String API_KEY = "&apikey=b54ed546";

        private Scanner readScanner = new Scanner(System.in); 
        private ConsumeApi consumeApi = new ConsumeApi();
        private ConvertData convertData = new ConvertData();

           

        public void showMenu() {
      
        System.out.println("Digite o nome da série:");
        
        var titleSerie  = readScanner.nextLine();
        var json = consumeApi.getData(ADDRESS + titleSerie.replace(" ", "+") + API_KEY);
        DataSeries data = convertData.getData(json, DataSeries.class);
        System.out.println(data);

        List<DataSeason> seasons = new ArrayList<>();
        
        for (int i = 1; i <= data.totalSeasons(); i++) {
                json = consumeApi.getData(ADDRESS + titleSerie.replace(" ", "+") +"&season=" + i + API_KEY);  
                DataSeason dataSeason = convertData.getData(json, DataSeason.class);
                seasons.add(dataSeason);

        }
        seasons.forEach(t -> t.Episodes().forEach(e -> System.out.println(e.Title())));


System.out.println("Cinco Episodios mais bem avaliados: ");
        List<DataEpisode> dataEpisodes = seasons.stream()
                .flatMap(t -> t.Episodes().stream())
                .collect(Collectors.toList());

                dataEpisodes.stream()
                .sorted(Comparator.comparing(DataEpisode::imdbRating).reversed())
                .filter(e -> !e.imdbRating().equalsIgnoreCase("N/A"))
                .limit(5)
                .forEach(System.out::println);
    }
}
