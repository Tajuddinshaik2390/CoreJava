package OOPS;

interface vehicle {
	void move();

	final static int age = 10;

	default void show() {

	}

}

interface Ani {
	void move();
}

public class Main4 implements vehicle {

	

	public static void main(String[] args) {
		Main4 e = new Main4();
		e.move();

	}

	@Override
	public void move() {
		System.out.println("1");		
	}

}
