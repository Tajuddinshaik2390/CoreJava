package com.spring.Bean;

public class Employee {
	private String name;
	private int emp_id;
	 
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	
	public void setEmp_id(int Emp_id) {
		this.emp_id=Emp_id;
	}
	
	public void display() {
		System.out.println("name--"   +name);
		System.out.println("emp_id---"+emp_id);
	}
}
