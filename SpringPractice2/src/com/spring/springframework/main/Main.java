package com.spring.springframework.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.springframework.Employee.Employee;
import com.spring.springframework.resources.SpringConfigurationFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurationFile.class);

		Employee emp = (Employee) context.getBean("emp");
		//we can also use this type for calling object Employee emp1=context.getBean(Employee.class);
		emp.display();
		System.out.println("--------------------------------------");

		Employee emp2 = (Employee) context.getBean("object2");
		emp2.display();

	}
}
