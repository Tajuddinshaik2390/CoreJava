package INterviewCorePrepartion;

public class MainmenthodOverride {

	int age;
	{
		age = 10;
		synchronized (this) {
			age++;
		}
		System.out.println("block called" + age);
	}
	static {
		System.out.println("static block called");
	}

	MainmenthodOverride() {
		System.out.println("construcor called");
	}

	public static void main(String[] args, int age) {
		System.out.println("this is second main" + age);
	}

	public static void hello() {

		int cat = 10;
		System.out.println(cat);

		System.out.println("hello world");
	}

	public static void main(String[] args) {
		new MainmenthodOverride();
		hello();

		MainmenthodOverride.main(args, 23);
	}

}
