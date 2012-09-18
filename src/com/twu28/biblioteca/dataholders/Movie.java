package com.twu28.biblioteca.dataholders;

public class Movie {
    private String name;
    private String director;
    private String rating;

    public Movie(String name, String director, String rating) {
        this.name=name;
        this.director=director;
        this.rating=rating;
    }

    public String getRating() {
        return this.rating;
    }

    public String showDetails() {
        return (this.name + " has rating: " + this.rating);
    }
}
