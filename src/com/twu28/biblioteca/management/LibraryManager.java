package com.twu28.biblioteca.management;

import com.twu28.biblioteca.dataholders.Library;
import com.twu28.biblioteca.dataholders.LibraryUser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private Library library;
    private List<String> menuOptions = new ArrayList<String>();
    private List<LibraryUser> users = new ArrayList<LibraryUser>();
    private MovieManager movieManager;

    public LibraryManager(Library library, List<LibraryUser> users, MovieManager movieManager) {
        this.library = library;
        library.instantiateBookList();
        this.movieManager=movieManager;
        movieManager.instantiateMovieList();
        this.users = users;
    }

    public String showMenu() {
        String menuFields = "";
        for (String menuOption : menuOptions) {
            menuFields = menuFields + menuOption + "\n";
        }
        return menuFields;
    }

    public void initializeMenu() {
        menuOptions.add("~~~~WELCOME TO BANGALORE PUBLIC LIBRARY SYSTEM~~~");
        menuOptions.add("1. View Books");
        menuOptions.add("2. Reserve a Book");
        menuOptions.add("3. Check Library Number");
        menuOptions.add("4. View Movies");
        menuOptions.add("5. Quit");
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
        return "Invalid Choice!!! Please enter valid choice";
    }

    public String showLibraryNumber(String userId) {
        Integer id = Integer.parseInt(userId);
        for (LibraryUser user : users) {
            if (user.getId() == id) return user.getLibraryNumber();
        }
        return "Please Talk To Librarian";
    }

    public String reserveBook(String bookName) {
        return library.reserveBook(bookName);
    }
}
