package com.twu28.biblioteca.dataholders;


import org.junit.Assert;
import org.junit.Test;

public class testLibrary {
    Library library = new Library();
    @Test
    public void testForViewOfBookList(){
        library.instantiateBookList();
        String expectedString = "Complete Reference To Java Available\n" +
                "Head First Java Available\n" +
                "TDD By Example Available\n";
        Assert.assertEquals(expectedString, library.viewBooks());
    }

    @Test
    public void testForReserveBookIfBookIsAvailable()
    {
        library.instantiateBookList();
        Assert.assertEquals("Thank You!!Enjoy the book", library.reserveBook("Complete Reference To Java"));
    }

    @Test
    public void testForReserveBookIfBookIsAlreadyReserved()
    {
        library.instantiateBookList();
        library.reserveBook("Complete Reference To Java");
        Assert.assertEquals("Sorry we don't have that book yet.", library.reserveBook("Complete Reference To Java"));
    }

    @Test
    public void testForReserveBookIfBookIsNotInLibrary()
    {
        library.instantiateBookList();
        Assert.assertEquals("No such book available in library", library.reserveBook("Easy Way To Java"));
    }
}
