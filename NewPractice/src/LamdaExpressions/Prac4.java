package LamdaExpressions;

class demo2 implements Runnable {

	@Override
	public void run() {
		System.out.println("its run method called");
	}

}

public class Prac4 {
	public static void main(String[] args) {
//		Runnable ref = () ->
//		System.out.println("its run method");	{
//
//			};
			Thread t=new Thread(()-> System.out.println("its thread method"));
			t.start();
	}
	
	

}
