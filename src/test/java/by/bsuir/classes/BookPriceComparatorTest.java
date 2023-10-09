package by.bsuir.classes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BookPriceComparatorTest {

    @Test
    public void testCompare() {
        Book[] books = {new Book("BName", "Author", 45),
                new Book("CName", "Author", 60),
                new Book("AName", "Author", 15)};
        Book[] sortedBooks = {new Book("AName", "Author", 15),
                new Book("BName", "Author", 45),
                new Book("CName", "Author", 60)};
        Arrays.sort(books, new BookPriceComparator());
        for(int i = 0;i < books.length;i++) {
            assertEquals(sortedBooks[i], books[i]);
        }
    }
}