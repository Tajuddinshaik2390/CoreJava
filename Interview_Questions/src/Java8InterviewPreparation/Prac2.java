package Java8InterviewPreparation;

//import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Prac2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("taj","shaik","taj");

		Set<String> set = new HashSet<String>();
		list.stream().filter(a -> !set.add(a)).collect(Collectors.toSet()) . forEach(a -> System.out.println(a));
		;
	}
}
