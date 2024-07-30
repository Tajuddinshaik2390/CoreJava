package P1_JAVA8;

public interface DefaultExp {
	//public abstract void he();
	public  default void hey() {
		System.out.println("hey i am default method");
	}
	
	public default void helloWorld() {
		System.out.println("hello world");
	}

}
