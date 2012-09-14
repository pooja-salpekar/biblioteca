package com.twu28.biblioteca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private static List<LibraryUser> users = new ArrayList<LibraryUser>();

    public static void main(String[] args) throws IOException {
        users.add(new LibraryUser(001));
        users.add(new LibraryUser(002));
        UserInterface userInterface = new UserInterface(new Library(), users);
        userInterface.start(new SystemConsole());
    }
}
