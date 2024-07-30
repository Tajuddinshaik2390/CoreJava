package LamdaExpressions;

import java.util.function.Function;

public class Prac6 implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		return t.length();
	}
	
	public static void main(String[] args) {
//		Function<String, Integer> obj=new Prac6();
//		System.out.println(obj.apply("taj"));

		Function<String, Integer> ref= (String t)->  t.length();
			System.out.println(ref.apply("tauj"));
		
	}

}
