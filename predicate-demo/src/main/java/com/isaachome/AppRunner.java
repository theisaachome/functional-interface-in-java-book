package com.isaachome;

import java.util.function.Predicate;

public class AppRunner {
	public static void main(String[] args) {
		Predicate<Integer> p1= x-> x>10;
		
		System.out.println(p1.test(20));
	}
}
