package com.isaachome;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Boolean, Integer> f = x->x == true? 100:0;
		Function<String, Boolean> fsb = (x) -> Boolean.parseBoolean(x);
		System.out.println(f.compose(fsb).apply("true"));
		var result = Double.valueOf(29.89).intValue();
		System.out.println(result);
	}
}
