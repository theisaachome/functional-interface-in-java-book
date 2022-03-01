package com.isaachome.model;

public class Employee {
	private String name;
	private String address;
	private Integer salary;
	private String title;
	
	
	public Employee(String name, String address, Integer salary, String title) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
