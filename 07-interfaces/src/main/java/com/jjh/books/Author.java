package com.jjh.books;

public class Author implements PrettyPrinter {
	
	private String name;
	private Address address;

	public Author(String name) {
		this.name = name;
	}
	
	public Author(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Author [name=%s, address=%s]", name, address);
	}

	// Implements the PrettyPrinter interface

	public void prettyPrint() {
		System.out.printf("Author [name=%s, address=%s]%n", name, address);
	}

}
