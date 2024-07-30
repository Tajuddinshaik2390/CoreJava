package com.spring.Beans;

public class Employee {
	private String name;
	private int id;
	private float salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void SetId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;

	}

	public void SetSalary(float salary) {
		this.salary = salary;
	}

	public void show() {
		System.out.println("name-----" + name);
		System.out.println("id---------" + id);
		System.out.println("salary---" + salary);

	}

}
