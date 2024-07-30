package OOPS;

interface intr {
	void show();

	default void display() {
		System.out.println("its default");
	}

	private void show2() {

	}

	static void ashow3() {

	}

}

interface intr2 {
	void show();

}

public class Prac12 implements intr {

	@Override
	public void show() {

		System.out.println("inherited method");
	}

	public static void main(String[] args) {
		Prac12 p = new Prac12();
		p.show();
	}

}
