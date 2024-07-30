package LamdaExpressions;
@FunctionalInterface
interface demo3 {
	void run();

	default void run1() {
		System.out.println("run1 is called");
	}

public 	static void run2() {
		System.out.println("run2 is called");
	}
}

public class Prac5 implements demo3 {
	@Override
	public void run() {
System.out.println("its ruin meythod from functional interface");
		
	}
	

public static void main(String[] args) {
	

		Prac5 p= new Prac5();
		demo3.run2();

}
}
