package com.spring.springframework.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.springframework.Employee.Employee;

@Configuration
public class SpringConfigurationFile {
	/*
	 * if we want to declare bean name(bean object name) as different and method
	 * name as differnt then we can try like this and in the main method u need to
	 * declare "bean object name at getBean method" remember not method name in the
	 * below example we actually used bean object name and method name as one
	 * 
	 * @Bean("BeanObjectName") public Employee emp() { Employee emp = new
	 * Employee(); emp.setEmp_name("taj"); emp.setEmp_id(123); return emp; }
	 * 
	 * 
	 */
	@Bean()
	public Employee emp() {
		Employee emp = new Employee();
		emp.setEmp_name("taj");
		emp.setEmp_id(123);
		return emp;

	}

	@Bean("object2")
	public Employee emp2() {
		Employee emp2 = new Employee();
		emp2.setEmp_name("ammi");
		emp2.setEmp_id(234);
		return emp2;

	}

}
