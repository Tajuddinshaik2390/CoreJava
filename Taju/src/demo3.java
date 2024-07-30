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
	animal(animal A2){
		
		
		this.name=A2.name;
		this.age=A2.age;
	}
	animal(){
		
	}
}
public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
animal A1=new animal();
A1.name="taj";
A1.age=24;
animal A2=new animal(A1);

A1.eat();
A2.printinfo();

	}

}
