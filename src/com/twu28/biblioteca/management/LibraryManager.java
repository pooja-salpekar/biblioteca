package com.twu28.biblioteca.management;

import com.twu28.biblioteca.dataholders.Library;

import java.io.IOException;
import java.util.List;

public class LibraryManager {
    private Library library;
    private MovieManager movieManager;
    private LibraryMenu libraryMenu;

    public LibraryManager(Library library, MovieManager movieManager) {
        this.library = library;
        this.libraryMenu = new LibraryMenu();
        library.instantiateBookList();
        this.movieManager = movieManager;
        movieManager.instantiateMovieList();
    }

    public List<String> getMenuItems() {
        return libraryMenu.getItems();
    }

    public String menuDrivenNavigator(int choice) throws IOException {
        if (choice == 1)
            return (library.viewBooks());
        if (choice == 2) {
            return "Enter the name of the book:";
        }
        if (choice == 3) {
            return "Enter your user id";
        }
        if (choice == 4)
            return (movieManager.viewMovies());
        if (choice == 5)
            return ("Enter username and password:");
        return "Invalid Choice!!! Please enter valid choice";
    }


    public String reserveBook(String bookName) {
        return library.reserveBook(bookName);
    }


}
