
public class Prac1 {
	public static void main(String[] args) {
		// run time exception /unchecked
		
		
//	
//		System.out.println("1");
//		System.out.println(2);
//		System.out.println(3);
//		try {
//			System.out.println(10 / 0);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(4);
//		}
//
//		finally {
//			System.out.println("taj");
//		}
//	}
		
		multi m =new multi();
		m.start();
		
}

 class main {
	final int age = 10;

	final void show() {
System.out.println("hwyyy");
	}

}
class main2 extends main{
//	void show() {
		
	}
}


class multi extends Thread{
	public void run() {
		System.out.println("thread started");
	}
	
}

