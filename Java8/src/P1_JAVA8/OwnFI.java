package P1_JAVA8;

//@FunctionalInterface
public interface OwnFI {
	//public abstract void hello();

	default void gravityValue() {
		System.out.println("9,8");
	}

	public static void hey() {
		System.out.println("hey static method");
	}
	
	public default void helloWorld() {
		System.out.println("hello world");
	}

}
