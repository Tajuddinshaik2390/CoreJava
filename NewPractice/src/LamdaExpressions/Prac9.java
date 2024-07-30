package LamdaExpressions;

import java.util.function.Consumer;

class A implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}

public class Prac9 {
	public static void main(String[] args) {
//	Consumer<String> ref =new A();
//	ref.accept("taj");
		Consumer<String> re = (input) -> System.out.println("called");
		re.accept("taj");

	}
}
