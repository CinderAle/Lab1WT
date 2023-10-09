package by.bsuir.classes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BookAuthorComparatorTest {
    private final Book[] books = {new Book("CName", "AAuthor", 0),
            new Book("BName", "AAuthor", 0),
            new Book("AName", "BAuthor", 0)};
    @Test
    public void testCompare() {
        Book[] sortedBooks = {new Book("CName", "AAuthor", 0),
                new Book("BName", "AAuthor", 0),
                new Book("AName", "BAuthor", 0)};
        Arrays.sort(books, new BookAuthorComparator());
        for(int i = 0;i < books.length;i++) {
            assertEquals(sortedBooks[i], books[i]);
        }
    }

    @Test
    public void testCompareWithTitle() {
        Book[] sortedBooks = {new Book("BName", "AAuthor", 0),
                new Book("CName", "AAuthor", 0),
                new Book("AName", "BAuthor", 0)};
        Arrays.sort(books, new BookAuthorComparator().thenComparing(new BookTitleComparator()));
        for(int i = 0;i < books.length;i++) {
            assertEquals(sortedBooks[i], books[i]);
        }
    }
}