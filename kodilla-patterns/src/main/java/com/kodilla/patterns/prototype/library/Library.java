package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = getName() + "\n";
        for(Book book : books) {
            s = s + book.toString();
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        Book clonedBook;
        try {
            for (Book book : books) {
                clonedBook = book.shallowCopy();
                clonedLibrary.getBooks().add(clonedBook);
            }
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }
        return clonedLibrary;
    }
}