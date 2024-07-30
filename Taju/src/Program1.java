
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
	pen(pen p2){
		this.name=p2.name;
		this.price=p2.price;
		
	}
	pen(){
		
	}
	
}
public class Program1 {
public static void main(String args[]){
	pen p1=new pen();
	p1.name="apsara";
	p1.price=25;
	pen a2=new pen(p1); 
	p1.write();
	p1.printinfo();
	
}
}
