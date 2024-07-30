package P1_JAVA8;

import java.util.ArrayList;
import java.util.List;

public class StreamProcessing {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(26);
		list.add(23);
		list.add(42);
		list.add(25);
//list.stream().filter(x-> x%2==0).collect(Collectors.toList()).forEach(x->System.out.println(x));
		// long data=list.stream().filter(x->x>30).count();
		// System.out.println(data);
		long data = list.stream().filter(X -> X >= 25).sorted((x, y) -> y.compareTo(x)).count();
		System.out.println(data);

	}
}
