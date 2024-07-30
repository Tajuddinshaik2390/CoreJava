package Java_interview;

import java.util.stream.IntStream;

public class Stream2 {
	public static void main(String[] args) {

		System.out.println(checkPrime(53));
	}

//public static boolean checkPrime(int number) {
//	if(number<=1) {
//		return false;
//	}
//	return IntStream.range(2, number).noneMatch(a->number%a==0);
//}
	public static boolean checkPrime(int number) {
		boolean isdivisable = false;
//		for (int i = 2; i < number; i++) {
//			if (number % i == 0) {
//				isdivisable = true;
//				break;
//
//			}
		//}
		return    IntStream.range(2, number).noneMatch(n -> number % n == 0);

	}
}
