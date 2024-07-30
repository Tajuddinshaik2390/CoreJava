package Java8InterviewPreparation;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
//import java.util.function.Predicate;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
import static  java.util.stream.Collectors.*;
import   java.util.stream.Collectors;

public class Prac1 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,6);
//	list.stream().filter(a->a%2==0).collect(Collectors.toList()).forEach(a->System.out.println("The even numbers are "+a));
//	list.stream().filter(a->a%2!=0).collect(Collectors.toList()).forEach(a->System.out.println("The odd numbers are "+a));
	Map<Boolean, List<Integer>> dsya=list.stream().collect(partitioningBy(a->a%2==0));
	System.out.println(dsya.get(true));
	System.out.println(dsya.get(false));
	
}
}
