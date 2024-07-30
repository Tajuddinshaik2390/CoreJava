package Java8InterviewPreparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prac6 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 23, 45, 6);
		list.stream().min(Comparator.naturalOrder());
		list.stream().max(Comparator.naturalOrder());
	}
}
