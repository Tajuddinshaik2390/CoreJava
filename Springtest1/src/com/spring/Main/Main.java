package com.spring.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Bean.Employee;

public class Main {
public static void main(String[] args) {
	String config_location="com/spring/Resources/ApplicationContext.Xml";
	ApplicationContext con=new ClassPathXmlApplicationContext(config_location);
	Employee emp=(Employee) con.getBean("empid");
	emp.display();
}
}
