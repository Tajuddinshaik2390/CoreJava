package Java8InterviewPreparation;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prac14 {
	public static void main(String[] args) {
		String name = "hello world";
//		String na=namereverse(name);
//		System.out.println(na);
		 String data=Arrays.stream(name.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		System.out.println(data);
//		String data = Stream.of(name.split(" ")).map(word -> new StringBuilder(word).reverse())
//				.collect(Collectors.joining(" "));
//		System.out.println(data);
//		
		
		
	}
	public static String namereverse(String name) {
		return Arrays.stream(name.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
	}
}
