package by.bsuir.classes;

import java.util.Comparator;
import java.util.Objects;

public class Book implements java.lang.Comparable, Comparator {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static int getEdition() {
        return edition;
    }
    public static void setEdition(int edition) {
        Book.edition = edition;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    @Override
    public boolean equals(Object object) {
        if(object == null || !object.getClass().equals(getClass())) {
            return false;
        }
        Book bookObject = (Book) object;
        return this.price == bookObject.price &&
               this.title.equals(bookObject.title) &&
               this.author.equals(bookObject.author);
    }
    @Override
    public String toString() {
        return "[title = \"" + title + '"' + ", author = \"" + author + '"' + ", price = " + price + ']';
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
    public Book clone() {
        return new Book(this.title, this.author, this.price);
    }
    @Override
    public int compareTo(Object object) {
        if(this.equals(object)) {
            return 0;
        }
        Book book = (Book) object;
        return this.isbn > book.isbn ? 1 : -1;
    }
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
