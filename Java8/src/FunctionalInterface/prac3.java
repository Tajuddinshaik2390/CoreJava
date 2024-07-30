package FunctionalInterface;

interface dummy {
	void sound(String message);
}

public class prac3 {
	public static void main(String[] args) {
		dummy d = (message) -> System.out.println("its a lamda expresssion");

		d.sound("hello world");
		d.sound("hey");

	}
}

