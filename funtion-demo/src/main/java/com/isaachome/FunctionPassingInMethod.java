package com.isaachome;

import java.util.function.Function;

import com.isaachome.model.Person;
import com.isaachome.repo.PersonRepo;

public class FunctionPassingInMethod {

	public static <T,R>R transform(Function<T, R>f,T t) {
		return f.apply(t);
	}
	public static void main(String[] args) {
		Function<String, Integer> fsi = s-> Integer.parseInt(s);
		Function<Person, String> fps= p->p.getName();
		Integer i = transform(fsi, "10000");
		System.out.println(i);
		
		var list =PersonRepo.getAllPersons();
		for(var p:list) {
			System.out.println(transform(fps, p));
		}
	}
}
