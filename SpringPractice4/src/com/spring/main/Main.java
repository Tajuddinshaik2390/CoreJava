package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Student.Student;
import com.spring.resources.ConfigFile;

public class Main {
public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile.class);
	Student st=(Student)context.getBean("student");
	
	
	
st.display();
	
	

}
}
