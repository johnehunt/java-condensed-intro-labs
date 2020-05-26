package com.jjh.books;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private static Address authorAddress = new Address(10, "High Street", "Any Town", "Somerset", "SA1 23Z");
    private static Author author = new Author("Pete Smith", authorAddress);

    private static Address publisherAddress = new Address(1, "Main Street", "Some City", "Kent", "KA1 43A");
    private static Publisher publisher = new Publisher("Tech Books Publishing Ltd.", publisherAddress);

    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Java Unleashed", author, publisher, 15.95);
    }

    @AfterEach
    void tearDown() {
        book = null;
    }

    @Test
    void createBookTest() {
        String title = book.getTitle();
        Author bookAuthor = book.getAuthor();
        Publisher bookPublisher = book.getPublisher();
        double price = book.getPrice();
        assertEquals("Java Unleashed", title, "Title should be 'Java Unleased'");
        assertEquals(bookAuthor, BookTest.author);
        assertEquals(bookPublisher, BookTest.publisher);
        assertEquals(15.95, price);
    }

    @Test
    void setSaleDiscountAndCheckDiscount() {
        double myPi = 22.0d / 7.0d;
        System.out.println(myPi);
        book.setSaleDiscount(10.0);
        double discount = book.calculateSalePrice();
        assertEquals(14.36, discount, 0.01);
    }

    @Test
    void setANegativePriceWillThrowException() {
        assertThrows(BookException.class, () -> {
            book = new Book("Java Unleashed", author, publisher, -1.0);
        });
    }


}