package com.jjh.books;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Bookshop {

    private final List<Book> books = new ArrayList<>();

    public Bookshop() {
        setup();
    }

    private void setup() {
        Address authorAddress = new Address(10, "High Street", "Any Town", "Somerset", "SA1 23Z");
        Author author = new Author("Pete Smith", authorAddress);

        Address publisherAddress = new Address(1, "Main Street", "Some City", "Kent", "KA1 43A");
        Publisher publisher = new Publisher("Tech Books Publishing Ltd.", publisherAddress);
        Book book = new Book("Java Unleashed", author, publisher, 15.95);
        this.books.add(book);
        System.out.println("\nCalculating the Sales Discount price");
        book.setSaleDiscount(10.0);
        System.out.println("Sale price of book: " + book.calculateSalePrice());

        try {
            Book book2 = new Book("Java For Professionals",
                    author,
                    publisher,
                    12.55);
            this.books.add(book2);
        } catch (PriceException exp) {
            exp.printStackTrace();
        }

    }

    public List<Book> getBooks() {
        return this.books;
    }


    public int size() {
        return this.books.size();
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    public boolean contains(Object o) {
        return books.contains(o);
    }

    public Iterator<Book> iterator() {
        return books.iterator();
    }

    public boolean add(Book book) {
        return books.add(book);
    }

    public boolean remove(Object o) {
        return books.remove(o);
    }

    public boolean addAll(Collection<? extends Book> c) {
        return books.addAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return books.removeAll(c);
    }

    public void clear() {
        books.clear();
    }

    public Book get(int index) {
        return books.get(index);
    }

    public Book remove(int index) {
        return books.remove(index);
    }
}
