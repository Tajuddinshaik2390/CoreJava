package LamdaExpressions;

interface Addition {
	public abstract int add(int a, int b);
}

class impl implements Addition {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

}

public class Prac2 {
	public static void main(String[] args) {

		Addition add = (a, b) -> {
			return a + b;
		};

		System.out.println(add.add(1, 2));
	}
}
