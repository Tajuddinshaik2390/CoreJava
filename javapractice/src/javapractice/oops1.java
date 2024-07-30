package javapractice;

 class Man{
static  String colour; 
 static String name;
 static double height;
 
    void Maninfo() {
System.out.println(colour);
System.out.println(name);
System.out.println(height);
 }
    class Animal {
   	 void Animal() {
   		 
   		 System.out.println(colour);
   		 System.out.println(name);
   		 System.out.println(height);
   		  } 
    }
   
 }
 


public class oops1 {

	public static void main(String[] args) {
		
Man m=new Man();
Man A= new Man();
m.colour="white";
m.name="TAj";
m.height=6.0;
m.Maninfo();
A.colour="black";
A.height=10.0;
A.name="Girraffe";
A.Maninfo();


	}

}
