package MultiThreading;

public class Prac6 extends Thread {
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println("my name is " + Thread.currentThread().getName() + i + "" + currentThread().isDaemon());
		}
	}

	public static void main(String[] args) {
		Prac6 p = new Prac6();
	p.setDaemon(true);
		p.setName("child");
		p.start();

		currentThread().setName("MAIN");
		currentThread().setDaemon(true);
		for (int i = 1; i < 100; i++) {
			System.out.println("i am " + currentThread().getName() + i);
		}
	}
}
