package com.twu28.biblioteca.userinterfaces;

import com.twu28.biblioteca.console.Console;
import com.twu28.biblioteca.dataholders.Library;
import com.twu28.biblioteca.management.LibraryManager;
import com.twu28.biblioteca.management.LibraryUserManager;
import com.twu28.biblioteca.management.MovieManager;

import java.io.IOException;

public class UserInterface {

    private LibraryManager libraryManager;
    private Console console;
    private LibraryUserManager libraryUserManager;

    public UserInterface(Library library, MovieManager movieManager, Console console, LibraryUserManager libraryUserManager) {
        this.libraryManager = new LibraryManager(library, movieManager);
        this.console=console;
        this.libraryUserManager = libraryUserManager;
    }

    public void start() throws IOException {
        int choice;
        libraryManager.initializeMenu();
        displayOnScreen(libraryManager.showMenu());
        while ((choice = getUserInput()) != 6) {
            String outputFromLibraryManager = libraryManager.menuDrivenNavigator(choice);
            decideOnOutputFromLibraryManager( outputFromLibraryManager);
            displayOnScreen(libraryManager.showMenu());
        }
    }

    private void decideOnOutputFromLibraryManager( String outputFromLibraryManager) throws IOException {
        displayOnScreen(outputFromLibraryManager);
        if (outputFromLibraryManager.equals("Enter the name of the book:")) {
            askDetailsBeforeReservingBook();
        }
        if (outputFromLibraryManager.equals("Enter your user id")) {
            askDetailsBeforeShowingUserData();
        }
        if(outputFromLibraryManager=="Enter username and password:"){
            takeAndProcessLoginData();
        }
    }

    private void takeAndProcessLoginData() throws IOException {
        String userName = console.takeInput();
        String password=console.takeInput();
        if(libraryUserManager.verify(userName,password)){
            libraryUserManager.login(userName,password);
            displayOnScreen("Login successful");
        }
        displayOnScreen("Invalid username and password!! Try again.");
    }

    private void askDetailsBeforeShowingUserData() throws IOException {
        String userId = console.takeInput();
        if(libraryUserManager.findIfLoggedIn(userId))
            displayOnScreen(showUserDetails(userId));
        else
            displayOnScreen("You Are Not logged in.. Please login to view the details");
    }

    private void askDetailsBeforeReservingBook() throws IOException {
        String bookName = console.takeInput();
        displayOnScreen("Enter library account number:");
        String libraryNumber=console.takeInput();
        if(libraryUserManager.findIfLoggedIn(libraryNumber))
            displayOnScreen(reserveBook(bookName));
        else
            displayOnScreen("You Are Not logged in.. Please login to reserve the book");
    }

    private String showUserDetails(String userId) {
        return libraryUserManager.showUserDetails(userId);
    }

    private String reserveBook(String bookName) {
        return libraryManager.reserveBook(bookName);
    }

    private void displayOnScreen(String textToBePrinted) {
        console.println(textToBePrinted);
    }


    private Integer getUserInput() throws IOException {
        String userChoice;
        userChoice = console.takeInput();
        return Integer.parseInt(userChoice);
    }


}
