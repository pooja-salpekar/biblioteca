package com.twu28.biblioteca.management;

import java.util.ArrayList;
import java.util.List;

public class LibraryMenu extends ArrayList<String> {
    static String WELCOME_MESSAGE = "~~~~WELCOME TO BANGALORE PUBLIC LIBRARY SYSTEM~~~";

    public LibraryMenu() {
        add("View Books");
        add("Reserve a Book");
        add("Show User Details");
        add("View Movies");
        add("Login");
        add("Quit");
    }

    public List<String> getItems() {
        List<String> menuItems = new ArrayList<String>();
        menuItems.add(WELCOME_MESSAGE);
        for (int i=0; i<this.size(); i++) {
            menuItems.add(String.format("%d. %s", i + 1, this.get(i)));
        }
        return menuItems;
    }
}
