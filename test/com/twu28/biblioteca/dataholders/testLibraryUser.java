package com.twu28.biblioteca.dataholders;
import org.junit.Assert;
import org.junit.Test;

public class testLibraryUser {
    LibraryUser user1 = new LibraryUser("Pooja", "9432100000", "pooja@gmail.com", "111-1111", "password");
    LibraryUser user2 = new LibraryUser("John", "9898980000", "john@gmail.com", "111-1112", "password");
    @Test
    public void testToGetUserId(){
        Assert.assertEquals("111-1111",user1.getId());
    }
    @Test
    public void testIfLibraryNumberAssociatedWithGivenIdIsReturned(){
        Assert.assertEquals("111-1111",user1.getLibraryNumber());
        Assert.assertEquals("111-1112",user2.getLibraryNumber());
    }
    @Test
    public void testIfUserDetailsAreReturned(){
        String expectedString= "Pooja 9432100000 pooja@gmail.com" ;
        Assert.assertEquals(expectedString,user1.showDetail());
    }
}
