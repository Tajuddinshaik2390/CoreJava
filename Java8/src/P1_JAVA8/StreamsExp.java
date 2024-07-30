package P1_JAVA8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsExp {
	public static void main(String[] args) {
		List<Pojoexp> age = new ArrayList<>();

//		Pojoexp obj=new Pojoexp();
//		obj.age=12;
//		obj.name="taj";
//		age.add(obj);

		age.add(new Pojoexp("khaja", 27));
		age.add(new Pojoexp("taj", 23));
		age.add(new Pojoexp("subani", 34));
		age.add(new Pojoexp("rehaman", 1));
		
		List<Pojoexp> nl=age.stream().filter(ages->ages.getAge()>15).collect(Collectors.toList());
		nl.stream().forEach(ages->System.out.println(ages.getAge()+""+ages.getName()));

//		for (Pojoexp filterdata : age) {
//
//			if (filterdata.getAge() > 15) {
//				newAI.add(filterdata);
//			}
//
//		}
//		for (Pojoexp pojoexp : newAI) {
//			System.out.println(pojoexp.getName()+""+pojoexp.getAge());
//		}
	}
}