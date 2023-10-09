package by.bsuir.classes.comparators;

import by.bsuir.classes.Book;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BookAuthorTitleComparatorTest {

    @Test
    public void testCompare() {
        Book[] books = {new Book("CName", "AAuthor", 0),
                new Book("BName", "AAuthor", 0),
                new Book("AName", "BAuthor", 0)};
        Book[] sortedBooks = {new Book("BName", "AAuthor", 0),
                new Book("CName", "AAuthor", 0),
                new Book("AName", "BAuthor", 0)};
        Arrays.sort(books, new BookAuthorTitleComparator());
        for(int i = 0;i < books.length;i++) {
            assertEquals(sortedBooks[i], books[i]);
        }
    }
}