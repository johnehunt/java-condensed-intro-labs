package com.jjh.books;

public abstract class Product implements Sales {

	private String title;
	private double price;
	private double salePercentage;
	
	
	public Product(String title, double price) {
		this.setTitle(title);
		this.setPrice(price);
	}
	
	public abstract void printer();
	
	public void setSaleDiscount(double salePercentage) {
		this.salePercentage = salePercentage / 100.0;
	}

	public double calculateSalePrice() {
		return price - (price * salePercentage);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0.01) {
			throw new PriceException("Illegal Price: " + price);
		}
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("title=%s, price=%s", title, price);
	}

}
