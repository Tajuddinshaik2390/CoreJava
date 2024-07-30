package Java8InterviewPreparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prac4 {
public static void main(String[] args) {
	List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78);
	//decimalList.stream().sorted((a,b)->b.compareTo(a)).forEach(a->System.out.println(a));
	decimalList.stream().sorted(Comparator.reverseOrder()).forEach(a->System.out.println(a));
}
}
