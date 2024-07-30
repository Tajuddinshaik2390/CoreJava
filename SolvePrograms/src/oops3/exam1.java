package oops3;
class student{
	String name;
	int age;
	void study() {
		System.out.println("Studying");
		
	}
	void Printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);

		
	}
	student(String name,int age){
	this.name=name;
	this.age=age;
	}
	
	student(){
		System.out.println("constructor czlld");
	}
	
}
public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student("salman",25);
s1.study();
	s1.Printinfo();
	 student s2=new student("taj",21);
	 s2.Printinfo();
	}
	

}
