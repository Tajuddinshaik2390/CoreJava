package OOPS;
class Car extends AbstractClass{

	@Override
	void start() {
		System.out.println("car starts with KEY");
	}
	
}

class Scooter extends AbstractClass{

	@Override
	void start() {
		
		System.out.println("Scooter starts with KICK");
		
	}
	
}

public class Prac11 {
	public static void main(String[] args) {
		Scooter obj=new Scooter();
		obj.start();
		Car obj2=new Car();
		obj2.start();
		obj2.run();
		
	}
	
	

	
}
