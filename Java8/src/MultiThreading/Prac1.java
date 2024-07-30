package MultiThreading;

public class Prac1 extends Thread {
public void run() {
	System.out.println("Thread is running");
	
}

public static void main(String[] args) {
	Prac1 p=new Prac1();
	p.start();
}
}
