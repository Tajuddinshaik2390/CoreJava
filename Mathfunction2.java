package core_basics;
import java.util.Scanner;

public class Mathfunction2 {

	public static void main(String[]args) {
		//finding hypotenuse of a triangle
		double base;
		double height;
		double result;
		System.out.println("enter base");
		Scanner sc=new Scanner(System.in);
		base=sc.nextDouble();
		System.out.println("enter height");
		height=sc.nextDouble();
		result= Math.sqrt((base*base)+(height*height));
		System.out.println("the hypotenuse of a triangle is "+result);
		sc.close();
	}
}
