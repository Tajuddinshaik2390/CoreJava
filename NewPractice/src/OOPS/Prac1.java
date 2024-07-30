package OOPS;

class Animal {
	void run() {
		System.out.println("its running");
	}

	void eating() {
		System.out.println("its eating");
	}
}

class Cat {
	String name;
	int age;

	public void nameSetting(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public void show() {
		System.out.println(name + age);
	}
}

public class Prac1 {

	String name;
	int num;

	public static void main(String[] args) {
		System.out.println("helloooo");
		Animal ref_obj = new Animal();
		ref_obj.run();
		ref_obj.eating();
		Prac1 ref_obj2 = new Prac1();
		ref_obj2.name = "Taj";
		ref_obj2.num = 1;

		System.out.println(ref_obj2.name + " " + ref_obj2.num);

		Cat ref = new Cat();
		ref.nameSetting("meow", 1);
		ref.show();
	}
}
