package com.twu28.biblioteca.userinterface;

import com.twu28.biblioteca.console.ConsoleStub;
import com.twu28.biblioteca.dataholders.Library;
import com.twu28.biblioteca.dataholders.LibraryUser;
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
    public void testforInvalidChoiceEntered() throws IOException {
        initializeForTests();
        ConsoleStub console = new ConsoleStub();
        console.println("6");
        console.println("5");
        userInterface.start(console);
        String expectedString = "Invalid Choice!!! Please enter valid choice";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserInputAsOne() throws IOException {
        initializeForTests();
        ConsoleStub console = new ConsoleStub();
        console.println("1");
        console.println("5");
        userInterface.start(console);
        String expectedString = "Complete Reference To Java Available\n" + "Head First Java Available\n" + "TDD By Example Available\n";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }
    @Test
    public void testForUserInputTwo() throws IOException {
        initializeForTests();
        ConsoleStub console = new ConsoleStub();
        console.println("2");
        console.println("TDD By Example");
        console.println("5");
        userInterface.start(console);
        String expectedString = "Thank You!!Enjoy the book";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserAsksToReserveAlreadyReservedBook() throws IOException {
        initializeForTests();
        ConsoleStub console = new ConsoleStub();
        console.println("2");
        console.println("TDD By Example");
        console.println("2");
        console.println("TDD By Example");
        console.println("5");
        userInterface.start(console);
        String expectedString = "Sorry we don't have that book yet.";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserAsksToReserveBookNotInLibrary() throws IOException {
        initializeForTests();
        ConsoleStub console = new ConsoleStub();
        console.println("2");
        console.println("Wings Of Fire");
        console.println("5");
        userInterface.start(console);
        String expectedString = "No such book available in library";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForCheckingLibraryNumber() throws IOException {
        initializeForTests();
        ConsoleStub console = new ConsoleStub();
        console.println("3");
        console.println("001");
        console.println("5");
        userInterface.start(console);
        String expectedString = "100001";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }
    @Test
    public void testForDisplayOfMovies() throws IOException {
        initializeForTests();
        ConsoleStub console =new ConsoleStub();
        console.println("4");
        console.println("5");
        userInterface.start(console);
        String expectedString = "Sholey has rating: 8.5\n" + "Taken has rating: 8\n" + "The Dark Knight Rises has rating: 9\n" + "Inception has rating: 7\n" + "Expandable2 has rating: N/A\n";
        Assert.assertEquals(expectedString,console.getRequiredDataFromConsole());
    }

    private void initializeForTests() {
        List<LibraryUser> users=new ArrayList<LibraryUser>();
        LibraryUser.reset();
        LibraryUser libraryUser = new LibraryUser(001) ;
        users.add(libraryUser);
        userInterface= new UserInterface(new Library(),users,new MovieManager());
    }

}
