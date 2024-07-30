package LamdaExpressions;

interface Shape {
	void  draw();
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("its a reectangle ");

	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("its a circle ");

	}
}

public class Prac1 {
	public static void main(String[] args) {

//		Shape circle = () -> System.out.println("its a circle ");
//		circle.draw();
//		Shape rectangle = () -> System.out.println("its a recatngle");
//		rectangle.draw();
		
		print(() -> System.out.println("its a circle "));
		print( () -> System.out.println("its a recatngle"));
//		print(circle);

	}
	public static void print(Shape shape) {
		shape.draw();
	}

}
