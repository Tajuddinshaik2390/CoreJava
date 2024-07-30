
public class Multi2 extends Thread {

	public void run() {

		for (int i = 1; i < 5; i++) {
			try {
				
//
//				System.out.println(currentThread().getPriority());
//				System.out.println(currentThread().getName());
				 Thread.sleep(100);
							} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);

		}

	}

	public static void main(String[] args) {
		Thread m = new Multi2();
		Thread m2 = new Multi2();
		m.start();
		m2.start();
		
	}
}
