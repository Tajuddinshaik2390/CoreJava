package core_basics;
import java.util.Scanner;

public class Scannerclass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("hey who are you");
	String name=sc.nextLine();
	
	System.out.println("really?");
	String confirm=sc.nextLine();
	System.out.println("I am "+name);
	System.out.println("ofcourse "+confirm);
	
}
}
