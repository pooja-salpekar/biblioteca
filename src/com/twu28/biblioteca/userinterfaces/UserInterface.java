package com.twu28.biblioteca.userinterfaces;

import com.twu28.biblioteca.console.Console;
import com.twu28.biblioteca.dataholders.Library;
import com.twu28.biblioteca.dataholders.LibraryUser;
import com.twu28.biblioteca.management.LibraryManager;
import com.twu28.biblioteca.management.MovieManager;

import java.io.IOException;
import java.util.List;

public class UserInterface {

    private LibraryManager libraryManager;


    public UserInterface(Library library, List<LibraryUser> users,MovieManager movieManager) {
        this.libraryManager = new LibraryManager(library, users, movieManager);
    }

    public void start(Console console) throws IOException {
        int choice;
        libraryManager.initializeMenu();
        displayOnScreen(console, libraryManager.showMenu());
        while ((choice = getUserInput(console)) != 5) {
            String outputFromLibraryManager = libraryManager.menuDrivenNavigator(choice);
            decideOnOutputFromLibraryManager(console, outputFromLibraryManager);
            displayOnScreen(console, libraryManager.showMenu());
        }
    }

    private void decideOnOutputFromLibraryManager(Console console, String outputFromLibraryManager) throws IOException {
        displayOnScreen(console, outputFromLibraryManager);
        if (outputFromLibraryManager.equals("Enter the name of the book:")) {
            String bookName = console.takeInput();
            displayOnScreen(console, reserveBook(bookName));
        }
        if (outputFromLibraryManager.equals("Enter your user id")) {
            String userId = console.takeInput();
            displayOnScreen(console, showLibraryNumber(userId));
        }
    }

    private String showLibraryNumber(String userId) {
        return libraryManager.showLibraryNumber(userId);
    }

    private String reserveBook(String bookName) {
        return libraryManager.reserveBook(bookName);
    }

    private void displayOnScreen(Console console, String textToBePrinted) {
        console.println(textToBePrinted);
    }


    private Integer getUserInput(Console console) throws IOException {
        String userChoice;
        userChoice = console.takeInput();
        return Integer.parseInt(userChoice);
    }


}
