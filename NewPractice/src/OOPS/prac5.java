package OOPS;

class A {
	public String colour;
	public String name;

	public A(String colour, String name) {
		this.colour = colour;
		this.name = name;
	}

	public void behaviour() {
		System.out.println("can move");
		System.out.println(colour+name);
	}

	public void behaviour2() {
		System.out.println("can walk");
	}
	public void behaviour3() {
		System.out.println("can walk");
	}
	

}

class B extends A {
	private String breed;

	public B(String colour, String name) {
		super(colour, name);

	}

	public void character() {
		System.out.println("has good character");
	}

	public void show() {
		System.out.println(colour + "  " + name);
	}
}

class C extends A{

	public C(String colour, String name) {
		super(colour, name);
		
	}
	public void methodOfC() {
		System.out.println("its C");
	}
	
}

public class prac5 {
	public static void main(String[] args) {
		A obj = new A("Green", "A");
		B obj2 = new B("Black", "B");
		C obj3=new C("white","C");
		obj3.methodOfC();
		obj.behaviour();
		obj2.behaviour();
		obj2.behaviour2();
		obj2.show();
	}
}
