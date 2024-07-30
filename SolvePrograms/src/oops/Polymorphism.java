package oops;
class Employee{
	String name;
	int age;

	public void study() {
		System.out.println("student is studying");
	}     
	
	
	public void printinfo(String name) {
		System.out.println(name);
	}
	public void printinfo(int age) {
		System.out.println(age);
	
}
	public void printinfo(String name,int age) {
		System.out.println(name +age);
	}
}

public class Polymorphism{
	public static void main(String args[]) {
		Employee E=new Employee();
		E.name="taj";
		E.age=24;
		E.study();
		E.printinfo(E.name , E.age);
		
	}
}
	



