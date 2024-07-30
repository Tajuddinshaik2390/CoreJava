package com.spring.Student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("TAj")
	private String name;
	@Value("123")
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void display() {
		System.out.println("name "+name);
		System.out.println("id "+id);
	}

}
