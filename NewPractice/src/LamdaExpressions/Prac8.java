package LamdaExpressions;

@FunctionalInterface
interface demoo {
	void eat();
}

public class Prac8 implements demoo {
	public static void main(String[] args) {

		demoo ref = () -> System.out.println("demo impl");

		// ref.eat();

		Prac8 p = new Prac8();
		p.print(() -> System.out.println("demo impl"));

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	public void print(demoo dem) {

		System.out.println("stst");
		dem.eat();

	}

}
