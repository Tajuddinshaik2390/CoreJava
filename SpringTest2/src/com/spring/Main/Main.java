package com.spring.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Beans.Employee;
import com.spring.Resources.ConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext obj=new AnnotationConfigApplicationContext(ConfigFile.class);
		Employee emp=(Employee)obj.getBean("emp");
emp.show();
System.out.println("---------------------------------------------");
Employee emp2=(Employee)obj.getBean("emp2");
emp2.show();
	}
}
