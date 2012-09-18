package com.twu28.biblioteca.management;

import com.twu28.biblioteca.management.MovieManager;
import org.junit.Assert;
import org.junit.Test;

public class testMovieManager {
    @Test
    public void testIfMovieNamesAreToTheList(){
        MovieManager movieManager = new MovieManager();
        movieManager.instantiateMovieList();
    }
    @Test
    public void testIfAllMovieNamesFromTheListAreReturned(){
        MovieManager movieManager = new MovieManager();
        movieManager.instantiateMovieList();
        String expectedString= "Sholey has rating: 8.5\n" + "Taken has rating: 8\n" + "The Dark Knight Rises has rating: 9\n" + "Inception has rating: 7\n" + "Expandable2 has rating: N/A\n";
        Assert.assertEquals(expectedString,movieManager.viewMovies());
    }

}
