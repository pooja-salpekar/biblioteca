package com.twu28.biblioteca.userinterfaces;

import com.twu28.biblioteca.console.SystemConsole;
import com.twu28.biblioteca.dataholders.Library;
import com.twu28.biblioteca.dataholders.LibraryUser;
import com.twu28.biblioteca.management.MovieManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private static List<LibraryUser> users = new ArrayList<LibraryUser>();

    public static void main(String[] args) throws IOException {
        users.add(new LibraryUser(001));
        users.add(new LibraryUser(002));
        UserInterface userInterface = new UserInterface(new Library(), users,new MovieManager());
        userInterface.start(new SystemConsole());
    }
}
