class animal{
	void  eat() {
		System.out.println("eating");
	}
	
	
		void barking() {
			System.out.println("dog barking");
	}
}
class dog extends animal{


}

public class inheritance1 {
	public static void main (String arg[]) {
		animal an=new animal();
		an.eat();
		an.barking();
	}
}




