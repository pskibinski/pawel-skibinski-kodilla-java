package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        Book book1 = new Book("Sanderson Brandon", "Words of Radiance", 2014, "001");
        Book book2 = new Book("Sanderson Brandon", "The Way of Kings", 2010, "002");
        Book book3 = new Book("Wegner Robert M.", "Wszyscy jesteśmy Meekhańczykami", 2013, "003");
        Book book4 = new Book("Sapkowski Andrzej", "Miecz Przeznaczenia", 1992, "004");
        Book book5 = new Book("Sapkowski Andrzej", "Ostatnie Życzenie", 1993, "005");

        Set<Book> books = new HashSet<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter adapter = new MedianAdapter();

        //When
        int median = adapter.publicationYearMedian(books);

        //Then
        System.out.println(median);
        assertEquals(2010, median);
    }
}
