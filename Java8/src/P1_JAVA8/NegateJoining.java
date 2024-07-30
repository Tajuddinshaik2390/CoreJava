package P1_JAVA8;

import java.util.function.Predicate;

public class NegateJoining {
public static void main(String[] args) {
	Predicate<String> checkLength=length-> length.length()<5;
	System.out.println("length "+checkLength.test("tajuddin"));
	
	Predicate<String> checkeven=length-> length.length()%2==0;
	System.out.println("even or not "+checkeven.test("taj"));
	System.out.println(checkLength.and(checkeven).test("taju"));
	System.out.println(checkLength.or(checkeven).test("taju"));
	System.out.println(checkLength.negate().test("taju"));
}
}
