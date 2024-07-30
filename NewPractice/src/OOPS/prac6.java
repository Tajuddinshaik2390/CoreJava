package OOPS;
//method overloading
public class prac6 {
	
	
public static void main(String[] args) {
	System.out.println("main method called");
	
	prac6 obj=new prac6();
	obj.main(1);
}

public static void main(int a) {
	System.out.println("int method called");
}
}
