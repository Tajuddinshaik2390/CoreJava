package OOPS;

public class prac4 {
	private String firstName;
	private String lastName;
	private int age;

	private prac4(String fistname, String lastName, int age) {
		this.firstName = fistname;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;

	}

	private String getLastName() {
		return lastName;
	}

	private int getAge() {
		return age;
	}

	private void setFistName(String firstName) {
		this.firstName = firstName;
	}

	public void SetLastName(String lastName) {
		this.lastName = lastName;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		prac4 obj = new prac4("TAj", "Shaik", 25);
//		obj.setFistName("Taj");
//		obj.lastName = "shaik";
//		obj.setAge(25);
		System.out.println(obj.getFirstName() + obj.getLastName() + obj.getAge());
	}
}
