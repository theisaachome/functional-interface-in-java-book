package com.isaachome;

import java.util.function.Consumer;

public class ConsumerSimple {
	private static int sum =0;
	public static void main(String[] args) {
		Consumer<Integer> consum = (x)-> sum+=x;
		consum.accept(10);
		System.out.println(sum);
	}
}
