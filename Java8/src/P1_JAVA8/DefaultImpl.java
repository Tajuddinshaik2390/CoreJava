package P1_JAVA8;

public class DefaultImpl implements DefaultExp,OwnFI{
	
	
	public static void main(String[] args) {
		DefaultImpl obj= new DefaultImpl();
		obj.hey();
		obj.helloWorld();
		
	}

	@Override
	public void helloWorld() {
		// TODO Auto-generated method stub
		OwnFI.super.helloWorld();
	}
	
//	public   void hey() {
//		System.out.println("over ridden of default method");
//	}

	
}
