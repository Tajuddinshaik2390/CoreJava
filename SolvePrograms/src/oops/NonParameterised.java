package oops;
class Student{
	String name;
	int age;
	public void study() {
		System.out.println("student is studying");
	}
	
	public void Printinfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
	
	Student(){
		System.out.println("constructor called");
	}
	
}



public class NonParameterised {
	public static void main(String args[]) {
		Student S=new Student();
		S.name="Taj";
		S.age=24;
		S.Printinfo();
		
	}

}
