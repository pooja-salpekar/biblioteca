package com.twu28.biblioteca.dataholders;

public class LibraryUser {
    private String userId;
    private String libraryNumber;
    private String userName;
    private String emailId;
    private String password;
    private String phoneNo;
    private boolean logged;

    public LibraryUser(String userName, String phoneNo, String email, String userId, String password) {
        this.userName=userName;
        this.phoneNo=phoneNo;
        this.emailId=email;
        this.userId=userId;
        this.password=password;
        this.libraryNumber=userId;
    }

    public String getId() {
        return this.userId;
    }

    public String getLibraryNumber() {
        return this.libraryNumber;
    }


    public String showDetail() {
        return this.userName+" "+this.phoneNo+" "+this.emailId;
    }

    public boolean verify(String userName, String password) {
        if(this.userName.equals(userName) && this.password.equals(password)) return true;
        return false;
    }

    public boolean isLoggedIn() {
        if(this.logged==true) return true;
        return false;
    }

    public void login() {
        this.logged=true;
    }
}
