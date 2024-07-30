package P1_JAVA8;

import java.util.function.Function;

public class FunctionChanining {
public static void main(String[] args) {
	Function<Integer, Integer> obj=(num)->2*num;
	System.out.println(obj.apply(2));
	Function<Integer, Integer> objj=(num)->num*num*num;
	System.out.println(objj.apply(2));
	
	System.out.println(obj.andThen(objj).apply(2));
	System.out.println(obj.compose(objj).apply(2));
}
}
