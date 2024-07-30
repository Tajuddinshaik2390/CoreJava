package P1_JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class Processing2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("taj", 12);
		Employee emp2 = new Employee("subani", 24);
		Employee emp3 = new Employee("khaja", 243);

		List<Employee> list = Arrays.asList(emp1, emp2, emp3);
		List<Integer> intlist = Arrays.asList(1, 2, 3, 4, 5);
		// intlist.stream().filter(a-> a%2==0).map(a-> a+a).filter(a->
		// a>6).forEach(a->System.out.println(a));
	list.stream().filter(a -> a.getId() % 2 == 0).sorted((a,b)->b.getId()).map(a-> {return a.getName();
	
	}).forEach(a-> System.out.println(a));
		
	// .map(a -> {
		// return a.getName();

		// }).forEach(a -> System.out.println(a));

	}
}
