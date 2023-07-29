package core_basics;
import java.util.Scanner;

public class Scanner2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("hey who are you");
	String name=sc.nextLine();
	System.out.println("whats your age ");
	int age=sc.nextInt();
	sc.nextLine();
	
	
	System.out.println("really?");
	String confirm=sc.nextLine();
	System.out.println("I am "+name);
	System.out.println("i am "+age+" "+"years old");

	System.out.println("ofcourse "+confirm);
	
}
}
