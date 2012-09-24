package com.twu28.biblioteca.management;

import junit.framework.Assert;
import org.junit.Test;

public class LibraryUserManagerTest {

    @Test
    public void testIfUserWhoIsNotLoggedAsksForUserDetails(){
        LibraryUserManager libraryUserManager = new LibraryUserManager();
        String expectedString = "You are not logged in.";
        Assert.assertEquals(expectedString,libraryUserManager.showUserDetails("111-1111"));
    }

    @Test
    public void testIfUserWhoIsLoggedAsksForUserDetails(){
        LibraryUserManager libraryUserManager = new LibraryUserManager();
        libraryUserManager.login("Pooja","password");
        String expectedString = "Pooja 9898980000 pooja@gmail.com";
        Assert.assertEquals(expectedString,libraryUserManager.showUserDetails("111-1111"));
    }

    @Test
    public void testIfDetailsAreAskedForWithWrongUserId(){
        LibraryUserManager libraryUserManager = new LibraryUserManager();
        String expectedString="User not found";
        Assert.assertEquals(expectedString, libraryUserManager.showUserDetails("111-1110"));
    }

    @Test
    public void testIfUserIsVerfied(){
        LibraryUserManager libraryUserManager = new LibraryUserManager();
        Assert.assertTrue(libraryUserManager.verify("xyz" , "password2"));
    }

    @Test
    public void testIfUserIsLoggedIn(){
        LibraryUserManager libraryUserManager = new LibraryUserManager();
        Assert.assertFalse(libraryUserManager.findIfLoggedIn("111-1111"));
    }

    @Test
    public void testForUserStatusAfterLogin(){
        LibraryUserManager libraryUserManager = new LibraryUserManager();
        libraryUserManager.login("Pooja","password");
        Assert.assertTrue(libraryUserManager.findIfLoggedIn("111-1111"));
    }
}
