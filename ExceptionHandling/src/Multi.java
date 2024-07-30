
public class Multi implements Runnable {

	@Override
	public void run() {
		System.out.println("started");
		
	}
	public static void main(String[] args) {
	
//	Multi m=new Multi();
//	Thread t=new Thread(m);
//	t.start();
		//Multi m= new Multi();
		Runnable r=new Multi();
	Thread t=new Thread(r,"my thread");
	t.setPriority(10);
	t.start();
	String name=t.getName();
System.out.println(name);
	}

}
