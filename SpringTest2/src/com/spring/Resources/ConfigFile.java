package com.spring.Resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.Beans.Employee;

@Configuration
public class ConfigFile {
	@Bean
	public Employee emp() {
		Employee e = new Employee();
		e.setName("taj");
		e.SetId(123);
		e.SetSalary((float) 300.0);
		return e;
	}
	
	@Bean("emp2")
	public Employee empp2() {
		Employee e2=new Employee();
		e2.SetId(123);
		return e2;
		
	}
}
