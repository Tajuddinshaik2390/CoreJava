package OOPS;
class Childs{
	public String name;
	 void show() {
		System.out.println("its child");
	}
}
public class Prac9 extends Childs{
	
	public void show() {
		super.show();
		super.name="hxh";
		System.out.println("its child");
	}

	
	public  void syo() {
		super.show();
	System.out.println("its parent");
	}
	
	
public static void main(String[] args) {
	Prac9 p=new  Prac9();
	p.show();
	p.syo();
}
}
