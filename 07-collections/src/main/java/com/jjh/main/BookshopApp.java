package com.jjh.main;

import com.jjh.books.Book;
import com.jjh.books.Bookshop;
import com.jjh.books.Sales;

public class BookshopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Java Bookshop");

		Bookshop bookshop = new Bookshop();

		for (Book book : bookshop.getBooks()) {
			System.out.println("Book: " + book);
		}

		if (bookshop.size() > 0) {
			Book book1 = bookshop.getBooks().get(0);
			book1.setSaleDiscount(10.0);
			System.out.println("Sale price of book: " + book1.calculateSalePrice());
			book1.getAuthor().prettyPrint();
			book1.getPublisher().prettyPrint();
		}

		if (bookshop.size() > 1) {
			Sales salesProduct = bookshop.getBooks().get(1);
			salesProduct.setSaleDiscount(10.0);
			System.out.println("Sale price of book: " + salesProduct.calculateSalePrice());
		}

	}

}
