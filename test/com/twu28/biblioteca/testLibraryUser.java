package com.twu28.biblioteca;
import org.junit.Assert;
import org.junit.Test;

public class testLibraryUser {
    LibraryUser user1 = new LibraryUser(001);
    LibraryUser user2 = new LibraryUser(002);
    @Test
    public void testToGetUserId(){
        Assert.assertEquals(001,user1.getId());
    }
    @Test
    public void testIfLibraryNumberAssociatedWithGivenIdIsReturned(){
        Assert.assertEquals("100001",user1.getLibraryNumber());
        Assert.assertEquals("100002",user2.getLibraryNumber());
    }
}
