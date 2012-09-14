package com.twu28.biblioteca;

public class Book {
    private String name;
    private String availability;


    public Book(String name, String availability) {
        this.name = name;
        this.availability = availability;
    }

    public boolean isAvailable() {
        if (this.availability.equals("Available")) return true;
        return false;
    }

    public String showDetails() {
        return this.name + " " + availability;
    }

    public String getName() {
        return this.name;
    }

    public void setStatus(String status) {
        this.availability = status;
    }
}
