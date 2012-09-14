package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class testUserInterface extends TestCase {
    private List<LibraryUser> users=new ArrayList<LibraryUser>();
    @Test
    public void testforInvalidChoiceEntered() throws IOException {
        users.add(new LibraryUser(001));
        UserInterface userInterface = new UserInterface(new Library(),users);
        ConsoleStub console = new ConsoleStub();
        console.println("5");
        console.println("4");
        userInterface.start(console);
        String expectedString = "Invalid Choice!!! Please enter valid choice";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserInputAsOne() throws IOException {
        users.add(new LibraryUser(001));
        UserInterface userInterface = new UserInterface(new Library(),users);
        ConsoleStub console = new ConsoleStub();
        console.println("1");
        console.println("4");
        userInterface.start(console);
        String expectedString = "Complete Reference To Java Available\n" + "Head First Java Available\n" + "TDD By Example Available\n";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }
    @Test
    public void testForUserInputTwo() throws IOException {
        users.add(new LibraryUser(001));
        UserInterface userInterface = new UserInterface(new Library(),users);
        ConsoleStub console = new ConsoleStub();
        console.println("2");
        console.println("TDD By Example");
        console.println("4");
        userInterface.start(console);
        String expectedString = "Enjoy the book";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserAsksToReserveAlreadyReservedBook() throws IOException {
        users.add(new LibraryUser(001));
        UserInterface userInterface = new UserInterface(new Library(),users);
        ConsoleStub console = new ConsoleStub();
        console.println("2");
        console.println("TDD By Example");
        console.println("2");
        console.println("TDD By Example");
        console.println("4");
        userInterface.start(console);
        String expectedString = "Sorry we don't have that book yet.";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForUserAsksToReserveBookNotInLibrary() throws IOException {
        users.add(new LibraryUser(001));
        UserInterface userInterface = new UserInterface(new Library(),users);
        ConsoleStub console = new ConsoleStub();
        console.println("2");
        console.println("Wings Of Fire");
        console.println("4");
        userInterface.start(console);
        String expectedString = "No such book available in library";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }

    @Test
    public void testForCheckingLibraryNumber() throws IOException {
        users.add(new LibraryUser(001));
        UserInterface userInterface = new UserInterface(new Library(),users);
        ConsoleStub console = new ConsoleStub();
        console.println("3");
        console.println("001");
        console.println("4");
        userInterface.start(console);
        String expectedString = "100001";
        Assert.assertEquals(expectedString, console.getRequiredDataFromConsole());
    }
}
