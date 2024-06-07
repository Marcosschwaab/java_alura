package screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import screenmatch.model.DataSeries;
import screenmatch.service.ConsumeApi;
import screenmatch.service.ConvertData;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    	var consumoApi = new ConsumeApi();
   		var json = consumoApi.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=b54ed546");
    	// System.out.println(json);


		ConvertData convertData = new ConvertData();
		DataSeries data = convertData.getData(json, DataSeries.class);
		System.out.println(data);

	}

}
