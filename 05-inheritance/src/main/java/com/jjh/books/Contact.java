package com.jjh.books;

public class Contact {
	
	private String name;
	private Address address;
	
	public Contact(String name, Address address) {
		super();
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
		return "name=" + name + ", address=" + address;
	}

}
