package INterviewCorePrepartion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringDuplicates {
	public static void main(String[] args) {
		Integer array[] = { 1, 2, 3, 4, 5,4 };
		Set<Integer> finaldata = duplicates(array);
		System.out.println(finaldata);

	}

	public static Set<Integer> duplicates(Integer array[]) {
		Set<Integer> duplicates = new HashSet<>();
		return Arrays.stream(array).filter(a -> !duplicates.add(a)).collect(Collectors.toSet());

	}

}
