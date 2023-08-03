package core_basics;
import java.util.*;
public class Operators {
public static void main(String args[]) {
	
	//finding Area and Perimeter of a Rectangle
	double length;
	double width;
	double Area;
	double Perimeter;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter lengh");
	length=sc.nextDouble();
	System.out.println("enter width");
	width=sc.nextDouble();
	Area=length+width;
	System.out.println("Area of a Rectangle is: "+Area);
	Perimeter=(2*(1+width));
	System.out.println("perimeter of a Rectangle is: "+Perimeter);
	
	sc.close();
}
}
