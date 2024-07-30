import java.util.Scanner;

public class Minimumof2 {
	
		public static void main(String args[]){
			Scanner in=new Scanner(System.in);
			System.out.println("enter first number");
			int i=in.nextInt();
			
			
			System.out.println("enter second number");
			int j=in.nextInt();
			
			int result = (i<j)?i:j;
		     System.out.println(result+"is a minimum value");

		}
		}