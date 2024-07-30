package oops;
class pen {
	
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
public class demo2 {
public static void main(String args[]){
	pen p1=new pen();
	p1.name="natraj";
	p1.price=25;
	p1.write();
	p1.printinfo();
	
}
}
