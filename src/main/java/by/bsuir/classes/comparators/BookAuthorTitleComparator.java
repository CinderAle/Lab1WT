package by.bsuir.classes.comparators;

import by.bsuir.classes.Book;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return new BookAuthorComparator().thenComparing(new BookTitleComparator()).compare(o1, o2);
    }
}
