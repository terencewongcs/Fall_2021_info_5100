package edu.northeastern.yanxuan;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Netflix netflix = new Netflix();
        Genre adventure = netflix.getGenre("Adventure");
        addAdventureMovies(adventure);
        Genre science = netflix.getGenre("Science");
        addScienceMovies(science);


        //For all movies released before 2000, add the string "(Classic)" to the title of the movie using
        //flatMap.
        netflix.genreList.stream().flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> {
                    if (movie.getReleaseDate().before(new GregorianCalendar(2000, Calendar.DECEMBER, 31).getTime())) {
                        movie.setTitle(movie.getTitle() + "(Classical)");
                    }
                });

        //use this method for all the movies.
        netflix.genreList.stream().flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> movie.addYeartoTitle());

        // Get the latest 3 movies released using .limit() method of stream.
        netflix.genreList.stream().flatMap(genre -> {
            Collections.sort(genre.getMovieList(), new Genre.DateComparator());

            netflix.genreList.stream().flatMap(genre -> {
                Collections.sort(genre.getMovieList(), new Genre.DateComparator());
                genre.getMovieList().stream();
            }).limit(3).forEach(movie -> System.out.println(movie.toString()));


        }
    }
        private static void addAdventureMovies(Genre adventure){
            GregorianCalendar date = new GregorianCalendar(1851, 2, 11);
            ArrayList<String> actors = new ArrayList<String>();
            actors.add("Tom");
            actors.add("Jerry");
            adventure.addMovie(new Movie("Moby Dick", date.getTime(), actors, "D1"));
            date = new GregorianCalendar(2011, 2, 11);
            adventure.addMovie(new Movie("Marine", date.getTime(), actors, "D2"));

        }
        private static void addScienceMovies (Genre science){
            GregorianCalendar date = new GregorianCalendar(2001, 2, 11);
            ArrayList<String> actors = new ArrayList<String>();
            actors.add("Sasa");
            actors.add("Y");
            science.addMovie(new Movie("Moon", date.getTime(), actors, "D3"));
            date = new GregorianCalendar(1888, 2, 11);
            science.addMovie(new Movie("Earth", date.getTime(), actors, "D4"));
            date = new GregorianCalendar(1900, 2, 11);
            science.addMovie(new Movie("Jupiter", date.getTime(), actors, "D5"));
            date = new GregorianCalendar(1977, 2, 11);
            science.addMovie(new Movie("Mars", date.getTime(), actors, "D6"));

        }
    }
