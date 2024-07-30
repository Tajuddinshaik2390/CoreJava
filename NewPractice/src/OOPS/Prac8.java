package OOPS;

 

 abstract class Child {
	 abstract void eat();
	  public int show() {
		System.out.println("i am child");
		return 0;
		
	}
}

public class Prac8  extends Child   {
	@Override
	void eat() {
		System.out.println("its eating");		
	}

	public  int show() throws RuntimeException  {
		
			//super.show();
		
		

		System.out.println("parent");
		return 0;
		
	}

	public static void main(String[] args)  {
		Prac8 obj = new Prac8();

		obj.show();
		obj.eat();
	}

		}

	

