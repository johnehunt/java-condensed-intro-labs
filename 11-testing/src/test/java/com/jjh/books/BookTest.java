package com.jjh.books;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BookTest {

    private static final Address authorAddress = new Address(10, "High Street", "Any Town", "Somerset", "SA1 23Z");
    private static final Author author = new Author("Pete Smith", authorAddress);

    private static final Address publisherAddress = new Address(1, "Main Street", "Some City", "Kent", "KA1 43A");
    private static final Publisher publisher = new Publisher("Tech Books Publishing Ltd.", publisherAddress);

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
        assertEquals(BookTest.author, bookAuthor);
        assertEquals(BookTest.publisher, bookPublisher);
        assertEquals(15.95, price);
    }

    @Test
    void setSaleDiscountAndCheckDiscount() {
        book.setSaleDiscount(10.0);
        double discount = book.calculateSalePrice();
        assertEquals(14.36, discount, 0.01);
    }

    @Test
    void createABookWithANegativePriceWillThrowException() {
        assertThrows(PriceException.class,
                () -> new Book("Java Unleashed", author, publisher, -1.0));
    }

    @Test
    void setANegativePriceWillThrowException() {
        assertThrows(PriceException.class, () -> book.setPrice(-1.0));
        assertEquals(15.95, book.getPrice());
    }


}