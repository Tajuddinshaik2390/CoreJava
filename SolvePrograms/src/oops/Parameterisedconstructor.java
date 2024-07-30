package oops;
class animal{
	String name;
	int age;
	public void eat() {
		System.out.println("it is eating");
	}
	
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	animal(String name,int age){
		
		
		this.name=name;
		this.age=age;
	}
}
public class Parameterisedconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
animal A1=new animal("cheetah",25);


A1.eat();
A1.printinfo();

	}
}
