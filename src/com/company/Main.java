package com.company;

import ibcsutils.Book;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Book("Karamazov Brothers", new String[]{"Fyodor Dostoyevsky"}, 1879);
        books[1] = new Book("The Portrait", new String[]{"Nikolai Gogol"}, 1835);
        for (Book b : books)
            System.out.println(b);
    }
}
