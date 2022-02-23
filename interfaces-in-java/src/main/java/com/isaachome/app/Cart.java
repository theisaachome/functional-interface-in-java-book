package com.isaachome.app;

public class Cart {

	private String item;
	private double price;
	private double discount;
	private double tax;
	public Cart(String item, double price, double discount, double tax) {
		super();
		this.item = item;
		this.price = price;
		this.discount = discount;
		this.tax = tax;
	}
	public Cart(Cart c) {
		this.item = c.item;
		this.price = c.price;
		this.discount = c.discount;
		this.tax =c.tax;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
