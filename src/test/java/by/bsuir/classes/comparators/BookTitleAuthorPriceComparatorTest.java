package by.bsuir.classes.comparators;

import by.bsuir.classes.Book;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BookTitleAuthorPriceComparatorTest {

    @Test
    public void testCompare() {
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
        Arrays.sort(books, new BookTitleAuthorPriceComparator());
        for(int i = 0;i < books.length;i++) {
            assertEquals(sortedBooks[i], books[i]);
        }
    }
}