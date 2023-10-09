package by.bsuir.classes.comparators;

import by.bsuir.classes.Book;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BookTitleComparatorTest {
    private final Book[] books = {new Book("AName", "CAuthor", 0),
            new Book("CName", "AAuthor", 0),
            new Book("AName", "BAuthor", 0)};
    @Test
    public void testCompare() {
        Book[] sortedBooks = {new Book("AName", "CAuthor", 0),
                              new Book("AName", "BAuthor", 0),
                              new Book("CName", "AAuthor", 0)};
        Arrays.sort(books, new BookTitleComparator());
        for(int i = 0;i < books.length;i++) {
            assertEquals(sortedBooks[i], books[i]);
        }
    }
}