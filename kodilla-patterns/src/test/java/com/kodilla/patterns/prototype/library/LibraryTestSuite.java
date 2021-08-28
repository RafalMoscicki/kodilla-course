package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("University");
        library.getBooks().add(new Book("Harry Potter", "Rowlin", LocalDate.of(2000, 5, 10)));
        library.getBooks().add(new Book("Lord of The Rings", "Tolkien", LocalDate.of(1980, 8, 20)));
        library.getBooks().add(new Book("Potop", "Sienkiewicz", LocalDate.of(1975, 2, 5)));
        library.getBooks().add(new Book("Silmarillion", "Tolkien", LocalDate.of(1978, 5, 10)));

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowClone();
            shallowClonedLibrary.setName("Shallow University");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepClone();
            deepClonedLibrary.setName("Deep University");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.getBooks().add(new Book("Cats", "Pixel & Bajt", LocalDate.now()));

        //Then
        assertEquals(5, library.getBooks().size());
        assertEquals(5, shallowClonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
