package edu.northeastern.yanxuan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Genre {
    String genreName;
    ArrayList<Movie> movieList;

    public Genre(String genreName) {
        this.genreName = genreName;
        movieList=new ArrayList<>();
    }

    public String getGenreName() {
        return genreName;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie(Movie m){
        movieList.add(m);
    }
    static class DateComparator implements Comparator<Movie>{
        public int compare(Movie a, Movie b){
            if(a.getReleaseDate().before(b.getReleaseDate()))
                return 1;
            else return 0;
        }
    }


}
