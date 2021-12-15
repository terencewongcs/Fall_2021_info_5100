package edu.northeastern.yanxuan;

import java.util.Date;
import java.util.List;

public class Movie{
    String title;
    Date releaseDate;
    List<String> actors;
    String Director;

    public Movie(String title, Date releaseDate, List<String> actors, String director) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.actors = actors;
        Director = director;
    }

    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public List<String> getActors() {
        return actors;
    }

    public String getDirector() {
        return Director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public void setDirector(String director) {
        Director = director;
    }

    //Write a method which that will add release year in the title of the movie and return the title
    public String addYeartoTitle(){
        int releaseYear = releaseDate.getYear();
        this.title=this.title+releaseYear;
        return this.title;
    }
}
