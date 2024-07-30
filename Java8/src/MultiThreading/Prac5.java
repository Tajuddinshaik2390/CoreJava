package MultiThreading;

public class Prac5 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println("this is child running on ->>>"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
//		Prac5 obj = new Prac5();
//		Thread t = new Thread(obj, "child thread");
//		t.start();
		
		Prac5 obj = new Prac5();
		Runnable t=new Thread(obj,"rf");
	t.run();
	
	Runnable n= new Prac5();
	Thread g=new Thread(n);
	g.start();
	

	}

}
