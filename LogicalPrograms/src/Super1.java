class animal{
	void eating() {
		System.out.println("it is eatinhg");
	}
}
	class dog extends animal{
		void eating()
		{
			System.out.println("it is waiting to eat");
		}
		void bark() {
			System.out.println("it is barking");
		}
	
	void work() {
		super.eating();
		bark();
	}
	
}

public class Super1 {
public static void main(String args[]) {
	dog d=new dog();
	d.work();
}
}
