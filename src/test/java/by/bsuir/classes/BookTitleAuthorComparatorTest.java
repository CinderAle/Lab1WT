package by.bsuir.classes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BookTitleAuthorComparatorTest extends BookTitleAuthorComparator {

    @Test
    public void testCompare() {
        Book[] books = {new Book("AName", "CAuthor", 0),
                new Book("CName", "AAuthor", 0),
                new Book("AName", "BAuthor", 0)};
        Book[] sortedBooks = {new Book("AName", "BAuthor", 0),
                new Book("AName", "CAuthor", 0),
                new Book("CName", "AAuthor", 0)};
        Arrays.sort(books, new BookTitleAuthorComparator());
        for(int i = 0;i < books.length;i++) {
            assertEquals(sortedBooks[i], books[i]);
        }
    }
}