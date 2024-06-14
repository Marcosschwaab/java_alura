package screenmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DataSeries(String Title, String Year, String Runtime, String Genre, Integer totalSeasons, String Type, String imdbRating) {


}
