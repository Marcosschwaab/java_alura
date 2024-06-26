package screenmatch.model;

import java.time.LocalDate;

public class Episode {
    private Integer season;
    private String title;
    private Integer Episode;
    private Double imdbRating;
    private LocalDate Released;
    
    
    public Episode(Integer numberSeason, DataEpisode dataEpisode) {
        this.season = numberSeason;
        this.title = dataEpisode.Title();
        this.Episode = Integer.parseInt(dataEpisode.Episode());
        try{
            this.imdbRating = Double.parseDouble(dataEpisode.imdbRating());
        } catch (NumberFormatException ex) {
            this.imdbRating = 0.0;
        }

        try{
            this.Released = LocalDate.parse(dataEpisode.Released());
        } catch (Exception ex) {
            this.Released = null;
        }
    } 

    public Integer getSeason() {
        return season;
    }
    public void setSeason(Integer season) {
        this.season = season;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getEpisode() {
        return Episode;
    }
    public void setEpisode(Integer episode) {
        Episode = episode;
    }
    public Double getImdbRating() {
        return imdbRating;
    }
    public void setImdbRating(Double imdbRating) {
        this.imdbRating = imdbRating;
    }
    public LocalDate getReleased() {
        return Released;
    }
    public void setReleased(LocalDate released) {
        Released = released;
    }

    @Override
    public String toString() {
        return "Season: " + season + " Episode: " + Episode + " Title: " + title + " Rating: " + imdbRating + " Released: " + Released;
    }   

}
