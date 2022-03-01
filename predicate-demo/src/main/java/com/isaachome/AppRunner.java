package com.isaachome;

import java.util.function.Predicate;

public class AppRunner {
	public static void main(String[] args) {
		Predicate<Integer> p1= x-> x>10;
		
		if(p1.and(x->x %2 ==0).test(99)) System.out.println("100 is greater thann 10");
		
		System.out.println(p1.test(20));
	}
}
