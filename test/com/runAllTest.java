package com;

import com.twu28.biblioteca.dataholders.testBook;
import com.twu28.biblioteca.dataholders.testLibrary;
import com.twu28.biblioteca.dataholders.testLibraryUser;
import com.twu28.biblioteca.dataholders.testMovie;
import com.twu28.biblioteca.management.testLibraryManager;
import com.twu28.biblioteca.management.testMovieManager;
import com.twu28.biblioteca.userinterface.testUserInterface;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
         testBook.class,
         testLibrary.class,
         testLibraryUser.class,
         testMovie.class,
         testLibraryManager.class,
         testMovieManager.class,
         testUserInterface.class,


})

public class runAllTest {}

