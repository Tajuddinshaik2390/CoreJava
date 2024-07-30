package MultiThreading;

public class Prac4 extends Thread {
	public void run() {
		for (int i = 1; i < 100; i++) {
			
			System.out.println(Thread.currentThread().getPriority());

//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}

	}

	public static void main(String[] args) {
		// System.out.println(Thread.currentThread().getName());
		Prac4 obj = new Prac4();
		obj.setPriority( MAX_PRIORITY);
		obj.start();
		

		for (int i = 1; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "" + currentThread().getPriority());
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
