package OOPS;

public class Main {

	void show(Object... a) {
		System.out.println("its a 1");

	}

	void show(String a, String b) {
		System.out.println("its a 2");
		
	}

	public static void main(String[] args) {
		Main a = new Main();
		//a.show("taj","ammi","khaja");
		a.main(1);
		System.out.println("main");
	}
	
	public static void main(int a) {
		System.out.println("its 2nd main");
	}
}