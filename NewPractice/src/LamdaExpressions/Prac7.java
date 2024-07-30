package LamdaExpressions;

import java.util.function.Consumer;

public class Prac7 implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println("hhhhh");
	}

	public static void main(String[] args) {

//	Consumer<String> obj=new Prac7();
//	obj.accept("taj");

		Consumer<String> obj = (t) -> System.out.println("hey");
		obj.accept("taj");

	
	}	
}
