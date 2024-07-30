package Java8InterviewPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Prac10 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 46, 7, 8, 9, 0, 66);
		int data = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(data);
	}
}
