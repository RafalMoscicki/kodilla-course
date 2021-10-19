package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("author1", "title1", 1990, "123456"));
        bookSet.add(new Book("author2", "title2", 1998, "123457"));
        bookSet.add(new Book("author3", "title3", 2002, "123458"));
        bookSet.add(new Book("author4", "title4", 2010, "123459"));

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(result, 2002);
    }
}
