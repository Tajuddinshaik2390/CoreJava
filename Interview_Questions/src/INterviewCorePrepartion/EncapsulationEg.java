package INterviewCorePrepartion;

public class EncapsulationEg {
	private String name;
	private int age;

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("enter valid age");
		}

	}

	public static void main(String args[]) {
		EncapsulationEg obj = new EncapsulationEg();

		obj.setName("taj");

		obj.setAge(23);
		System.out.println("name " + obj.getName()+"\nAge "+obj.getAge());
	}

}
