package Default;

public class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("calling using Airtel");
		
	}

	@Override
	public void sms() {
		System.out.println("sms using Airtel");
		
	}
	public  void  videocall() {
		System.out.println("video calling using airtel");
	}


}
