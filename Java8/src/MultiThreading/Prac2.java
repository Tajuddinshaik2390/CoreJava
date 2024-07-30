package MultiThreading;

public class Prac2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running");

	}

	public static void main(String[] args) {
		Prac2 r = new Prac2();
		Thread t = new Thread(r, "1st Tread");
		t.start();
		System.out.println(t.getName());

	}

}
