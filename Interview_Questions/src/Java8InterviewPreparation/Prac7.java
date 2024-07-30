package Java8InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prac7 {
	public static void main(String[] args) {
		String s1 = "taj jat";
		String s2 = "jat taj";
		s1 = Stream.of(s1.split("")).map(a -> a.toUpperCase()).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(a -> a.toUpperCase()).sorted().collect(Collectors.joining());
		if (s1.equals(s2)) {
			System.out.println("anagrams");
		} else {
			System.out.println("not anagram");

		}
	}
}
