package by.bsuir.classes;

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

    @Test
    public void testCompareWithAuthor() {
        Book[] sortedBooks = {new Book("AName", "BAuthor", 0),
                new Book("AName", "CAuthor", 0),
                new Book("CName", "AAuthor", 0)};
        Arrays.sort(books, new BookTitleComparator().thenComparing(new BookAuthorComparator()));
        for(int i = 0;i < books.length;i++) {
            assertEquals(sortedBooks[i], books[i]);
        }
    }

    @Test
    public void testCompareWithAuthorPrice() {
        Book[] books = {new Book("B-Name", "Author", 13),
                new Book("A-Name", "Author", 10),
                new Book("B-Name", "B-Author", 12),
                new Book("C-Name", "Author", 36),
                new Book("B-Name", "B-Author", 6)};
        Book[] sortedBooks = {new Book("A-Name", "Author", 10),
                        new Book("B-Name", "Author", 13),
                        new Book("B-Name", "B-Author", 6),
                        new Book("B-Name", "B-Author", 12),
                        new Book("C-Name", "Author", 36)};
        Arrays.sort(books, new BookTitleComparator().thenComparing(new BookAuthorComparator().thenComparing(new BookPriceComparator())));
        for(int i = 0;i < books.length;i++) {
            assertEquals(sortedBooks[i], books[i]);
        }
    }
}