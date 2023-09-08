package by.bsuir.classes;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testClone() {
        Book book = new Book("Title", "Author", 0);
        Book actual = book.clone();
        assertEquals(book, actual);
    }
    @Test
    public void testEquals() {
        assertEquals(new Book("title", "author", 0), new Book("title", "author", 0));
    }
}