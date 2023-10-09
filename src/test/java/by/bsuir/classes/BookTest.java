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
    @Test
    public void testComparable() {
        Book lesser = new Book("Title", "Author", 10, 30);
        Book larger = new Book("Title", "Author", 10, 40);
        Book equal = new Book("Title", "Author", 10, 40);
        assertEquals(-1, lesser.compareTo(larger));
        assertEquals(1, larger.compareTo(lesser));
        assertEquals(0, larger.compareTo(equal));
    }
}