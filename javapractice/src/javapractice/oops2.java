package javapractice;

class Mann{
static  String colour; 
 static String name;
 static double height;
 
    void Maninfo() {
System.out.println(colour);
System.out.println(name);
System.out.println(height);

 }
    void Maninfo2()
    {
    	System.out.println(colour);
    	System.out.println(name);
    	System.out.println(height);

    }
    Mann(){
    	
    }
    Mann(String colour,String name){
    	this.colour=colour;
    	this.name=name;
    	System.out.println("name:"+name + " "+"colour:"+colour);
    }

   
 
}


public class oops2 {

	public static void main(String[] args) {
		
Mann m=new Mann("pale white","ibrahim");
Mann m2= new Mann();
m.colour="white";
m.name="TAj";
m.height=6.0;
m.Maninfo();
m2.colour="black";
m2.name="salman";
m2.height=6.2;
m2.Maninfo2();

	}
}

