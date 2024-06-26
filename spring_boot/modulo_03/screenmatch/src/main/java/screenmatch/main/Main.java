package screenmatch.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.format.annotation.DateTimeFormat;

import screenmatch.model.DataEpisode;
import screenmatch.model.Episode;
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
                .filter(e -> !e.imdbRating().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DataEpisode::imdbRating).reversed())
                .limit(5)
                .forEach(System.out::println);


        List<Episode> episodes = seasons.stream()
                .flatMap(t -> t.Episodes().stream()
                        .map(d -> new Episode(t.Season(), d))
                ).collect(Collectors.toList());
                

                episodes.forEach(System.out::println);
                System.out.println("A partir de de ano você deseja ver os episodios?");
                var year = readScanner.nextInt();
                
                LocalDate date = LocalDate.of(year, 1 ,2);

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                episodes.stream()
                        .filter(e -> e.getReleased() != null && e.getReleased().isAfter(date))
                        .forEach(e-> System.out.println(
                        "Temporada: " + e.getSeason() +
                        " Episódio: " + e.getTitle() +
                            " Data lançamento: " + e.getReleased().format(formater)
                        )
                        );
    }
}
