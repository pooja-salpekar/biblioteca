package com.twu28.biblioteca.dataholders;

import java.util.HashMap;
import java.util.Map;

public class LibraryUser {
    private int id;
    private long libraryNumber;


    public LibraryUser(int userId) {
        this.id = userId;
        this.libraryNumber = 100000+this.id;
    }

    public long getId() {
        return this.id;
    }

    public String getLibraryNumber() {
        return Long.toString(this.libraryNumber);
    }


}
