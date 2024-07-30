package P1_JAVA8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public interface BIInterfaces {
public static void main(String[] args) {
	 BiPredicate<Integer,Integer> checks=(a,b)->a+b>=5;
	 System.out.println(checks.test(11,3));
	 
	 BiFunction<Integer,Integer, Integer> mult=(a,b)-> a*b;
	 System.out.println(mult.apply(1, 2));

	 	 
	 BiConsumer< Integer, Integer> adds=(a,b)-> System.out.println(a+b);
	 adds.accept(2, 3);
}
}
