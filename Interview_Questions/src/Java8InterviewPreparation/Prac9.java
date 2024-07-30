package Java8InterviewPreparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prac9 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 46, 7, 8, 9, 0, 66);
		list.stream().sorted().limit(3).forEach(System.out::print);
		System.out.println("-------------");
		list.stream().sorted((a, b) -> b.compareTo(a)).limit(3).forEach(a -> System.out.println(a));

	}
}
