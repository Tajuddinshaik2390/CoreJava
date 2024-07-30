package oops;
class Ink {
	
	String name;
	int price;
	public void write() {
		System.out.println("writing");
		
		
	}
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.price);
		}
	
	
}
public class demo4 {
public static void main(String args[]){
	Ink p1=new ink();
	p1.name="natraj";
	p1.price=25;
	p1.write();
	p1.printinfo();
	
}
}
