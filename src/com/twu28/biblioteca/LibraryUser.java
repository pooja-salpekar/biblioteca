package com.twu28.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class LibraryUser {
    private int id;
    private static long libraryAccountNumber = 100000;
    private long libraryNumber;


    public LibraryUser(int userId) {
        this.id = userId;
        this.libraryNumber = ++libraryAccountNumber;
    }

    public long getId() {
        return this.id;
    }

    public String getLibraryNumber() {
        return Long.toString(this.libraryNumber);
    }
}
