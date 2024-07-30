package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springPractice.Student;

public class Main {

	public static void main(String[] args) {
		String config_location="/com/spring/resources/applicationContext.xml";
	 ApplicationContext context=new ClassPathXmlApplicationContext(config_location);
	Student std=(Student) context.getBean("stdId");
std.display();

System.out.println("--------------------");
Student std2=(Student) context.getBean("stdId2");
std2.display();
	}

}
