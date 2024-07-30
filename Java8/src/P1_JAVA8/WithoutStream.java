package P1_JAVA8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutStream {
	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(23);
		ages.add(25);
		ages.add(24);
		ages.add(2);
//		WithoutStream obj = new WithoutStream();
//		List<Integer> data = obj.filterMethod(ages);
//		for (Integer finaldata : data) {
//			System.out.println(finaldata);
//		}

//		List<Integer> collecteddata=ages.stream().filter(age->age>2).collect(Collectors.toList());
//		collecteddata.stream().forEach(t ->System.out.println(t) );
		ages.stream().forEach(x->
			System.out.println(x));
		
	}

//	public List<Integer> filterMethod(List<Integer> ages) {
//		List<Integer> filterdata = new ArrayList<Integer>();
//		for (Integer filterdatastore : ages) {
//			if (filterdatastore > 2) {
//				filterdata.add(filterdatastore);
//			}
//
//		}
//
//		return filterdata;

	}


