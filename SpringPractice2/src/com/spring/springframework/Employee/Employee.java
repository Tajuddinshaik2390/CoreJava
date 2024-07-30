package com.spring.springframework.Employee;

public class Employee {
private String emp_name;
private int emp_id;
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public void display() {
	System.out.println("name "+emp_name);
	System.out.println("id "+emp_id);
}

}

//private String emp_name;
//private String emp_id;
//public String getEmp_name() {
//	return emp_name;
//}
//public void setEmp_name(String emp_name) {
//	this.emp_name = emp_name;
//}
//public String getEmp_id() {
//	return emp_id;
//}
//public void setEmp_id(String emp_id) {
//	this.emp_id = emp_id;
//}
