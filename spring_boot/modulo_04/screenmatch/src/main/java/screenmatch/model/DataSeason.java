package screenmatch.model;

import java.util.List;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DataSeason(Integer Season, Integer totalSeasons, String Title, String imdbRating, List<DataEpisode> Episodes) {

    public static Stream<DataSeason> stream() {

        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }

}
