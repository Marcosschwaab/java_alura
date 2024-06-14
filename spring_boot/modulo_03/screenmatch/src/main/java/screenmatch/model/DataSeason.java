package screenmatch.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DataSeason(Integer Season, Integer totalSeasons, String Title, String imdbRating, List<DataEpisode> Episodes) {

}
