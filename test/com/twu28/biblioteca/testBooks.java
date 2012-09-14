package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class testBooks {
    Book aJavaBook = new Book("Complete Reference To Java","Available");
   @Test
    public void testIfBookIsAvailable(){
       Assert.assertTrue(aJavaBook.isAvailable());
    }
    @Test
    public void testToGetDetailsOfABook(){
        String expectedDetails = "Complete Reference To Java Available";
      Assert.assertEquals(expectedDetails, aJavaBook.showDetails());
    }
    @Test
    public void testTheNAmeOfBookIsReturned(){
        String expectedName = "Complete Reference To Java";
        Assert.assertEquals(expectedName, aJavaBook.getName());
    }

}
