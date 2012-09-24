package com;

import com.twu28.biblioteca.dataholders.BookTest;
import com.twu28.biblioteca.dataholders.LibraryTest;
import com.twu28.biblioteca.dataholders.LibraryUserTest;
import com.twu28.biblioteca.dataholders.MovieTest;
import com.twu28.biblioteca.management.LibraryManagerTest;
import com.twu28.biblioteca.management.MovieManagerTest;
import com.twu28.biblioteca.userinterface.UserInterfaceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
         BookTest.class,
         LibraryTest.class,
         LibraryUserTest.class,
         MovieTest.class,
         LibraryManagerTest.class,
         MovieManagerTest.class,
         UserInterfaceTest.class,


})

public class runAllTest {}

