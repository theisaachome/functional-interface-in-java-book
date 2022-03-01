package com.isaachome;

import java.util.List;
import java.util.function.Function;

import com.isaachome.model.Employee;
import com.isaachome.repo.EmployeeRepo;

public class FunctionComposeDemo {
	static Function<Employee, String> getName = e ->e.getName();
	
	public static void main(String[] args) {
		List<Employee> list =EmployeeRepo.getAll();
		System.out.println("Employee List:");
		for(var emp:list) {
			System.out.println(getName.apply(emp));
		}
	}
}
