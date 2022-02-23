package com.isaachome.app;

public interface PayslipPrinter {

	void print(Cart c);
	
	private double getDiscountPrice(Cart c) {
		return c.getPrice() - (c.getPrice() * c.getDiscount());
	}
	default double computeTotal(Cart c) {
//		sum total after dicsount
		double discountedPrice = getDiscountPrice(c);
		return discountedPrice +(discountedPrice * c.getTax());
	}
}
