package FunctionalInterface;

public class Student {
	
	public static void main(String[] args) {
		Student s=new Student(1, "taj", 233);
		College.add(s);
	}
	private int age;
	private String name;
	private int rollno;

	public Student(int age, String name, int rollno) {
		super();
		this.age = age;
		this.name = name;
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}

class College {
	public static void add(Student s) {
		System.out.println(s.getAge()+s.getName()+s.getRollno());
	}
	}



