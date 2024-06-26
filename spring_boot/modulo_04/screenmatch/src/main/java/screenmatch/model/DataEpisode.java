package screenmatch.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataEpisode(String Title, String Released, String Season, String Episode, String imdbRating) {	

}
