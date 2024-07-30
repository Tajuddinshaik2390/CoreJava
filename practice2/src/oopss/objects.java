package oopss;



class pen{
	String colour;
	String type;
	
	
	//void functioning() {
		//System.out.println("writing");
		
	//}
	//void functioning() {
	//	System.out.println("writing");
	//}
	void colourofobj() {
		//this.colour=colour;
		System.out.println(this.colour);
	}
	
	pen(String colour,String type){
		this.colour=colour;
		//this.type=type;
		//System.out.println(colour + "\n"+ type);
		
	}
}
public class objects {
public static void main(String args[]) {
	/*pen obj=new pen();
	obj.colour="black";
	obj.type="ball";
	
	pen obj2=new pen();
	obj2.colour="red";
	obj2.type="gel";
	obj2.colourofobj();
	//obj.functioning();
	obj.colourofobj();
	
*/
	pen obj=new pen("red","ball");
	obj.colourofobj();
	pen obj2=new pen("blue","gel");
	obj2.colourofobj();
}
}
