package com.isaachome;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		Function<String, Integer> f1 = s->s.length();
		Function<String, String> f2 = s-> s + " and it is used in enterprise application.";
		System.out.println(f1.apply("java is good"));
		
		System.out.println(f2.apply("Java is OOP"));
	}
}
