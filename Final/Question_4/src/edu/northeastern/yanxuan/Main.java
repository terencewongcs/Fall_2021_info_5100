package edu.northeastern.yanxuan;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Netflix netflix = new Netflix();
        Genre adventure = netflix.getGenre("Adventure");
        addAdventureMovies(adventure);
        Genre science = netflix.getGenre("Science");
        addScienceMovies(science);
        netflix.addGenre(adventure);
        netflix.addGenre(science);

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
        List<Movie> ans = netflix.genreList.stream().flatMap(genre -> genre.movieList.stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.releaseDate.compareTo(o1.releaseDate);
            }
        }).limit(3).collect(Collectors.toList());

        //Create a predicate for release date before 2000 and a predicate for release date before 1990
        //and then Chain the predicates for finding movies between 1990 and 2000.
        List<Movie> listOfAllMovie = netflix.genreList.stream().flatMap(genre -> genre.movieList.stream()).collect(Collectors.toList());
        Predicate<Movie> dateBefore2000 = movie -> movie.releaseDate.before(new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime());
        Predicate<Movie> dateAfter1990 = movie -> movie.releaseDate.after(new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime());
        printMovieInRange((ArrayList<Movie>) listOfAllMovie, dateBefore2000, dateAfter1990);

        }
    private static void printMovieInRange(ArrayList<Movie> res, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: res) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.title);
            }
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
