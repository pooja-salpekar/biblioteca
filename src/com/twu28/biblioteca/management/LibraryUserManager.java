package com.twu28.biblioteca.management;

import com.twu28.biblioteca.dataholders.LibraryUser;

import java.util.ArrayList;
import java.util.List;

public class LibraryUserManager {
    private List<LibraryUser> users = new ArrayList<LibraryUser>();
    public LibraryUserManager() {
      instantiateUserList();
    }

    private void instantiateUserList() {
        users.add(new LibraryUser("Pooja" , "9898980000" , "pooja@gmail.com","111-1111","password"));
        users.add(new LibraryUser("xyz" , "9898980001" , "xyz@gmail.com","111-1112","password2"));
        users.add(new LibraryUser("pqr" , "9898980002" , "pqr@gmail.com","111-1113","password3"));
        users.add(new LibraryUser("lmn" , "9898980003" , "lmn@gmail.com","111-1114","password4"));
    }

    public String showUserDetails(String userId) {
        LibraryUser user = userExists(userId);
        if(user==null) return "User not found" ;
        if(!findIfLoggedIn(userId)) return "You are not logged in.";
        return user.showDetail();
    }

    private LibraryUser userExists(String userId) {
        for(LibraryUser user:users){
            if(user.getId().equals(userId))
                return user;
        }
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean verify(String userName, String password) {
        for(LibraryUser libraryUser:users){
            if(libraryUser.verify(userName,password)) return true;
        }
        return false;
    }

    public boolean findIfLoggedIn(String libraryNumber) {
       for(LibraryUser user:users){
           if(user.getLibraryNumber().equals(libraryNumber) && user.isLoggedIn())
               return true;
       }
      return false;
    }

    public void login(String userName, String password) {
        for(LibraryUser libraryUser:users){
            if(libraryUser.verify(userName,password))
                libraryUser.login();
        }
    }
}
