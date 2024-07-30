package Java8InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prac5 {
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp");

		String data = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(data);
	
//	     List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//         
//	        listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::print);
	    }
	
	}

