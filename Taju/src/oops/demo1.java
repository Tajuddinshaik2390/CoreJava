package oops;
class Pen{
	String name;
	int price;
	String type;
	public void write() {
		System.out.println("writing notes");
	}
		
		public void printname() {
			System.out.println(this.name);
			System.out.println(this.price);
			System.out.println(this.type);
	}
		
}
public class demo1 {
public static void main(String args[]) {
	Pen p=new Pen();
	p.name="natraj";
	p.price=5;
	p.type="gel";
	p.write();
	p.printname();
	Pen p2=new Pen();
	p2.name="apsara";
	p2.type="ballpoint";
	p2.price=10;
	p2.printname();
	
	

	
	
	
	
	
	
	
}
}
