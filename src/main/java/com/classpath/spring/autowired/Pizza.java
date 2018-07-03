package com.classpath.spring.autowired;

public class Pizza {

	private String name;
	private double price;
	
	public Pizza(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", price=" + price + "]";
	}

}
