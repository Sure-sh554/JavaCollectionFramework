package com.java.collections.arrays.library;

public class Library {
    private Book[] books;
    private int bookCount;
    private static final int MAX_BOOKS = 100;

    public Library() {
        books = new Book[MAX_BOOKS];
        bookCount = 0;
    }

    public void addBooks(Book book) {
        if (bookCount > MAX_BOOKS) {
            books[bookCount++] = book;
            System.out.println("Book added successfully");

        } else {
            System.out.println("Library is full");
        }
    }

    public void removeBook(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN() == ISBN) {
                System.out.println("Book removed successfully");
                return;
            }
        }
    }

    public Book searchBook(String query) {
        for (int i = 0; i < bookCount; i++) {
            return books[i];
        }
        return null;
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i].getTitle());
            }
        }
    }

    public void checkOutBook(String ISBN) {
        Book book = searchBook(ISBN);
        if (book != null) {
            book.checkOut();
        } else {
            System.out.println("Book not found");
        }


    }



}
