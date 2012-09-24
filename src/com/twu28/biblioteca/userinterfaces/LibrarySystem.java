package com.twu28.biblioteca.userinterfaces;

import com.twu28.biblioteca.console.SystemConsole;
import com.twu28.biblioteca.dataholders.Library;
import com.twu28.biblioteca.management.LibraryUserManager;
import com.twu28.biblioteca.management.MovieManager;

import java.io.IOException;

public class LibrarySystem {

    public static void main(String[] args) throws IOException {
        UserInterface userInterface = new UserInterface(new Library(), new MovieManager(), new SystemConsole(), new LibraryUserManager());
        userInterface.start();
    }
}
