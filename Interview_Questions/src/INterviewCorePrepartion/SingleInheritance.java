package INterviewCorePrepartion;

class Animal {
	// String name;

//	public Animal(String name) {
//		this.name = name;
//
//	}
	Animal() {
		System.out.println("called");
	}

	public void eat() {
		System.out.println("is eating");
	}
}

class Dog extends Animal {
	String breed;

	public Dog( String breed) {
		//super(name);
		this.breed = breed;

	}

	public void bark() {
		System.out.println( "is barking" + breed);
	}

}

public class SingleInheritance {
	public static void main(String[] args) {
		Dog d = new Dog( "persian");
		d.eat();
		d.bark();
	}

}
