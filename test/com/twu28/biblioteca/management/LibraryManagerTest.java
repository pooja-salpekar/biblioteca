package com.twu28.biblioteca.management;

import com.twu28.biblioteca.dataholders.Library;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class LibraryManagerTest {
    LibraryManager libraryManager = new LibraryManager(new Library(), new MovieManager());

    @Test
    public void testIfMenuIsDisplayed(){
        Assert.assertTrue(libraryManager.getMenuItems().size() > 0);
    }

    @Test
    public void testIfUserInputIsOneListOfBookIsReturned() throws IOException {
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
    public void testIfUserInputIsFourMoviesAreDisplayed() throws IOException {
        String expectedString="Sholey has rating: 8.5\n" +"Taken has rating: 8\n" +"The Dark Knight Rises has rating: 9\n" +"Inception has rating: 7\n" +"Expandable2 has rating: N/A\n";
        Assert.assertEquals(expectedString, libraryManager.menuDrivenNavigator(4));
    }

    @Test
    public void testIfUserInputIsFiveLoginDetailsAreAsked() throws IOException {
        String expectedString="Enter username and password:";
        Assert.assertEquals(expectedString, libraryManager.menuDrivenNavigator(5));
    }

    @Test
    public void testIfUserInputsInvalidChoiceHeIsNotified() throws IOException {
        String expectedString="Invalid Choice!!! Please enter valid choice";
        Assert.assertEquals(expectedString, libraryManager.menuDrivenNavigator(7));
    }

    @Test
    public void testIfBookIsReserved(){
        String expectedString="Thank You!!Enjoy the book";
        Assert.assertEquals(expectedString, libraryManager.reserveBook("Tdd By Example"));
    }

}
