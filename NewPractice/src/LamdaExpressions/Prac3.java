package LamdaExpressions;

class demo implements Runnable {

	@Override
	public void run() {
		System.out.println("run method called");
	}

}

public class Prac3 {
	public static void main(String[] args) {
		// demo d=new demo();
		// Thread t=new Thread(new demo());
		// t.start();

		
		Thread t = new Thread(() -> System.out.println("run method called"));
		t.run();

	}
}
