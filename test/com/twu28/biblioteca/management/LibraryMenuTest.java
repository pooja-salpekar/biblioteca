package com.twu28.biblioteca.management;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LibraryMenuTest {

    @Test
    public void shouldGetMenuOptions() {
        Assert.assertTrue(new LibraryMenu().size() > 0);
    }

    @Test
    public void shouldDisplayMenu() {
        List<String> menuItems = new LibraryMenu().getItems();
        Assert.assertEquals(LibraryMenu.WELCOME_MESSAGE, menuItems.get(0));
        Assert.assertEquals("1. View Books", menuItems.get(1));
    }
}
