package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("book " + n, "author " + n, LocalDate.now().minusYears(n))));

        Library shallowClonedLibrary = null;
        try{
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Library 2");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        //Then
    }
}
