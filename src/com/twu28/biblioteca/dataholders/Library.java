package com.twu28.biblioteca.dataholders;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public void instantiateBookList() {
        books.add(new Book("Complete Reference To Java", "Available"));
        books.add(new Book("Head First Java", "Available"));
        books.add(new Book("TDD By Example", "Available"));
    }

    public String viewBooks() {
        String allBooks = "";
        for (Book book : books) {
            allBooks = allBooks + book.showDetails() + "\n";
        }
        return allBooks;
    }

    public String reserveBook(String bookName) {
        Book book = searchBook(bookName);
        if (book == null) return "No such book available in library";
        if (book.isAvailable()) {
            book.setStatus("Reserved");
            return "Thank You!!Enjoy the book";
        }
        return "Sorry we don't have that book yet.";
    }

    private Book searchBook(String bookName) {
        for (Book book : books) {
            if (bookName.toLowerCase().equals(book.getName().toLowerCase())) return book;
        }
        return null;
    }
}
