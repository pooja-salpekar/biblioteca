package com.twu28.biblioteca.management;

import com.twu28.biblioteca.dataholders.Library;
import com.twu28.biblioteca.dataholders.LibraryUser;
import com.twu28.biblioteca.management.LibraryManager;
import com.twu28.biblioteca.management.MovieManager;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class testLibraryManager {
    private List<LibraryUser> users = new ArrayList<LibraryUser>();
    private  LibraryUser libraryUser = new LibraryUser(001);
    LibraryManager libraryManager = new LibraryManager(new Library(),users, new MovieManager());
    @Test
    public void testIfMenuIsDisplayed(){
        libraryManager.initializeMenu();
        String expectedString = "~~~~WELCOME TO BANGALORE PUBLIC LIBRARY SYSTEM~~~\n" +"1. View Books\n" +"2. Reserve a Book\n" +"3. Check Library Number\n" + "4. View Movies\n" +"5. Quit\n";
        Assert.assertEquals(expectedString, libraryManager.showMenu());
    }

    @Test
    public void testIfUserInputIsOneListOfBookIsReturned() throws IOException {
        libraryManager.initializeMenu();
        String expectedString="Complete Reference To Java Available\n" +"Head First Java Available\n" +"TDD By Example Available\n";
        Assert.assertEquals(expectedString, libraryManager.menuDrivenNavigator(1));
    }

    @Test
    public void testIfUserInputIsTwoBookNameIsAksed() throws IOException {
        String expectedString="Enter the name of the book:";
        Assert.assertEquals(expectedString, libraryManager.menuDrivenNavigator(2));
    }

    @Test
    public void testIfUserInputIsThreeUserIdIsAksed() throws IOException {
        String expectedString="Enter your user id";
        Assert.assertEquals(expectedString, libraryManager.menuDrivenNavigator(3));
    }

    @Test
    public void testIfUserInputsInvalidChoiceHeIsNotified() throws IOException {
        String expectedString="Invalid Choice!!! Please enter valid choice";
        Assert.assertEquals(expectedString, libraryManager.menuDrivenNavigator(5));
    }

    @Test
    public void testIfUserGetsHisLibraryNumber(){
        users.add(libraryUser);
        String expectedString="100001";
        Assert.assertEquals(expectedString, libraryManager.showLibraryNumber("001"));
    }
    @Test
    public void testIfUserGetsErrorMessageIfInvalidIdIsGiven(){
        users.add(libraryUser);
        String expectedString="Please Talk To Librarian";
        Assert.assertEquals(expectedString, libraryManager.showLibraryNumber("002"));
    }

}
