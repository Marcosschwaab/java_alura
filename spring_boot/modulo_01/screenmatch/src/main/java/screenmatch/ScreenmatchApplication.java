package screenmatch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import screenmatch.model.DataEpisode;
import screenmatch.model.DataSeries;
import screenmatch.model.DataSeason;
import screenmatch.service.ConsumeApi;
import screenmatch.service.ConvertData;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    	var consumeApi = new ConsumeApi();
   		var json = consumeApi.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=b54ed546");
    	// System.out.println(json);


		ConvertData convertData = new ConvertData();
		DataSeries data = convertData.getData(json, DataSeries.class);
		System.out.println(data);

		json = consumeApi.getData("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=b54ed546");	
		DataEpisode dataEpisode = convertData.getData(json, DataEpisode.class);
		System.out.println(dataEpisode);

		List<DataSeason> seasons = new ArrayList<>();

		for (int i = 1; i <= data.totalSeasons(); i++) {
	  	json = consumeApi.getData("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=6585022c");
		  DataSeason dataSeason = convertData.getData(json, DataSeason.class);
		  seasons.add(dataSeason);
		}
		seasons.forEach(System.out::println);
	}

}
