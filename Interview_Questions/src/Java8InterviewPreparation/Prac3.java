package Java8InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class Prac3 {
	public static void main(String[] args) {
		String inputString = "brahma taj brahma taj ";
		 List<String> list=Arrays.asList(inputString.split(" "));
		//List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler");
		Map<String, Long> data = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(data);
		
		System.out.println("--------------------------");
		List<Integer> listint=Arrays.asList(23,5,4,5);
		Map<Integer, Long> dataa = listint.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(data);
	}
}
//collect(groupingBy(Function.identity(),counting()));
