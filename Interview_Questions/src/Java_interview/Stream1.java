package Java_interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface mult {
	public abstract int multi(int a, int b);
}

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 6, 6, 3, 3);
		Set<Integer> set= new HashSet<>();
		list.stream().filter(a-> !set.add(a)).collect(Collectors.toSet()).forEach(a-> System.out.println(a));
		
		//list.stream().skip(2).forEach(x->System.out.println(x));
//		Set<Integer> set = new HashSet<>();
//		list.stream().filter(a -> !set.add(a)).collect(Collectors.toSet()).forEach(s -> System.out.println(s));

		// mult
//		mult m = (a, b) -> a * b;
//
//		System.out.println(m.multi(2, 4));
		
//		String data="hey i am taj hello i am taj";
//		List<String> list=Arrays.asList(data.split(" "));
//		 Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);

	}
}
