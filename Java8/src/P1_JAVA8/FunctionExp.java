package P1_JAVA8;

import java.util.function.Function;

public class FunctionExp {
public static void main(String[] args) {
	Function<Integer,Integer> obj=(num)->num+2;
	System.out.println(obj.apply(5));
}
}
