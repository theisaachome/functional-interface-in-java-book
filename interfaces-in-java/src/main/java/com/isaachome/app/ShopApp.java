package com.isaachome.app;



public class ShopApp {
	public static void main(String[] args) {
		PayslipPrinter simplePrinter= new PayslipPrinter() {
			@Override
			public void print(Cart c) {
				System.out.println("\nItem:\t" + c.getItem());
				System.out.println("Price:\t" + c.getPrice());
				System.out.println("Disc:\t" + c.getDiscount());
				System.out.println("Tax:\t" + c.getTax());
				System.out.println("Total:\t"+computeTotal(c));
			}
		};
		PayslipPrinter exemptPrinter = new PayslipPrinter() {
			@Override
			public void print(Cart c) {
				System.out.println("\nItem:\t" + c.getItem());
				System.out.println("Price:\t" + c.getPrice());
				System.out.println("Disc:\t" + c.getDiscount());
				System.out.println("Total:\t"+computeTotal(c));
			}
			@Override
			public double computeTotal(Cart c) {
				return c.getPrice()- (c.getPrice() * c.getDiscount());
			}
		};
		Cart cart = new Cart("shirt", 20.00, 0.05, 0.8);
		simplePrinter.print(cart);
		exemptPrinter.print(cart);
		
	}
}
