package com.twu28.biblioteca.dataholders;

import com.twu28.biblioteca.dataholders.Movie;
import junit.framework.Assert;
import org.junit.Test;

public class testMovie {
    @Test
    public void testIfMovieRatingIsReturned(){
        Movie aMovie= new Movie("Sholey" , "Ramesh Sippy", "8.5");
        String expectedString="8.5";
        Assert.assertEquals(expectedString,aMovie.getRating());
    }
    @Test
    public void testIfDetailsOfMovieIsReturned(){
        Movie aMovie= new Movie("Sholey" , "Ramesh Sippy", "8.5");
        String expectedString="Sholey has rating: 8.5";
        Assert.assertEquals(expectedString,aMovie.showDetails());
    }
}
