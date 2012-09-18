package com.twu28.biblioteca.management;

import com.twu28.biblioteca.dataholders.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    List<Movie> movies = new ArrayList<Movie>();
    public void instantiateMovieList() {
       movies.add(new Movie("Sholey" , "Ramesh Sippy" ,"8.5"));
       movies.add(new Movie("Taken" , "xyz" ,"8"));
       movies.add(new Movie("The Dark Knight Rises" , "xyz" ,"9"));
       movies.add(new Movie("Inception" , "xyz" ,"7"));
       movies.add(new Movie("Expandable2" , "" ,"N/A"));
    }


    public String viewMovies() {
        String allMovies = "";
        for (Movie movie : movies) {
            allMovies = allMovies + movie.showDetails() + "\n";
        }
        return allMovies;
    }
}
