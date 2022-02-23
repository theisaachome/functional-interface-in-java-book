package com.isaachome;

public interface SampleInterface {
	
	void method1(String s);
	default void defaulMethod(String s) {
		System.out.println( getPrefix(s)+" You are in default Method.");
	}
	
	private String getPrefix(String s) {
		return "Prefix : " + s;
	}
}
