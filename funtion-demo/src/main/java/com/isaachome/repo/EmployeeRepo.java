package com.isaachome.repo;

import java.util.Arrays;
import java.util.List;

import com.isaachome.model.Employee;

public class EmployeeRepo {

	
	public static List<Employee> getAll (){
		return Arrays.asList(
				new Employee("Tom Jones", "USA", 200000, "UFC fighter"),
				new Employee("Andy Timmons", "Brazil", 150000, "Artist"),
				new Employee("Nancy Smith", "UK", 100000, "Lawyer"),
				new Employee("Deborah Spring", "Germany", 120000, "Footballer"),
				new Employee("Athena", "Korea", 250000, "PUBGM Player"),
				new Employee("Her Gaming", "Aussie", 100000, "Youtuber"));
	}
	
}
