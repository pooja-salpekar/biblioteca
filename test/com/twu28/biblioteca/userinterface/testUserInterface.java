package com.twu28.biblioteca.userinterface;

import com.twu28.biblioteca.console.ConsoleStub;
import com.twu28.biblioteca.dataholders.Library;
import com.twu28.biblioteca.dataholders.LibraryUser;
import com.twu28.biblioteca.management.LibraryUserManager;
import com.twu28.biblioteca.management.MovieManager;
import com.twu28.biblioteca.userinterfaces.UserInterface;
import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class testUserInterface {
    private UserInterface userInterface;
    @Test
    public void testForInvalidChoiceEntered() throws IOException {
        ConsoleStub console = new ConsoleStub();
        initializeForTests(console);
        console.println("7");
        console.println("6");
        userInterface.start();
        String expectedString = "Invalid Choice!!! Please enter valid choice";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserInputAsOne() throws IOException {
        ConsoleStub console =new ConsoleStub();
        initializeForTests(console);
        console.println("1");
        console.println("6");
        userInterface.start();
        String expectedString = "Complete Reference To Java Available\n" + "Head First Java Available\n" + "TDD By Example Available\n";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }
    @Test
    public void testForUserWhoIsNotLoggedInInputTwo() throws IOException {
        ConsoleStub console =new ConsoleStub();
        initializeForTests(console);
        console.println("2");
        console.println("TDD By Example");
        console.println("111-1111");
        console.println("6");
        userInterface.start();
        String expectedString = "You Are Not logged in.. Please login to reserve the book";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserWhoIsLoggedInInputTwo() throws IOException {
        ConsoleStub console =new ConsoleStub();
        initializeForTests(console);
        console.println("5");
        console.println("Pooja");
        console.println("password");
        console.println("2");
        console.println("TDD By Example");
        console.println("111-1111");
        console.println("6");
        userInterface.start();
        String expectedString = "Thank You!!Enjoy the book";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserAsksToReserveAlreadyReservedBook() throws IOException {
        ConsoleStub console =new ConsoleStub();
        initializeForTests(console);
        console.println("5");
        console.println("Pooja");
        console.println("password");
        console.println("2");
        console.println("TDD By Example");
        console.println("111-1111");
        console.println("2");
        console.println("TDD By Example");
        console.println("111-1111");
        console.println("6");
        userInterface.start();
        String expectedString = "Sorry we don't have that book yet.";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserAsksToReserveBookNotInLibrary() throws IOException {
        ConsoleStub console =new ConsoleStub();
        initializeForTests(console);
        console.println("5");
        console.println("Pooja");
        console.println("password");
        console.println("2");
        console.println("Wings Of Fire");
        console.println("111-1111");
        console.println("6");
        userInterface.start();
        String expectedString = "No such book available in library";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForDisplayOfMovies() throws IOException {
        ConsoleStub console =new ConsoleStub();
        initializeForTests(console);
        console.println("4");
        console.println("6");
        userInterface.start();
        String expectedString = "Sholey has rating: 8.5\n" + "Taken has rating: 8\n" + "The Dark Knight Rises has rating: 9\n" + "Inception has rating: 7\n" + "Expandable2 has rating: N/A\n";
        Assert.assertEquals(expectedString,console.getRequiredDataFromConsole());
    }

    private void initializeForTests(ConsoleStub console) {
        List<LibraryUser> users=new ArrayList<LibraryUser>();
        LibraryUser libraryUser = new LibraryUser("Pooja", "001", "pooja@gmail.com", "111-1111", "password") ;
        users.add(libraryUser);
        userInterface= new UserInterface(new Library(), new MovieManager(),console, new LibraryUserManager());
    }

}
