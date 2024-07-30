package Practice;

class m1 {
	m1(prac5 obj) {
		System.out.println("i am const");
	}
}

public class prac5 {

	m1 m = new m1(this);

	public static void main(String[] args) {
		prac5 p = new prac5();

	}
}
