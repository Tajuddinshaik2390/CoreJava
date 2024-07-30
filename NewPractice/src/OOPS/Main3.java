package OOPS;

public abstract class Main3 {
	abstract void show();
	 	 void see() {
		System.out.println("concrete method");
		}
	public static void main(String[] args) {
		scooter s=new scooter();
		s.show();
	}
	
	
	
}


class scooter extends Main3{
int tyres=2;
	@Override
	void show() {
			System.out.println("starts with kick");	
	}
	
	
}
class car extends Main3{

	@Override
	void show() {
		System.out.println("starts with key");		
	}
	
}

