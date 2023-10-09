package by.bsuir.classes.comparators;

import by.bsuir.classes.Book;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return new BookTitleComparator().thenComparing(new BookAuthorComparator()).compare(o1, o2);
    }
}
