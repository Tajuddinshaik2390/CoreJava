import java.util.Scanner;

public class Maximumof2 {

		
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("enter first number");
			int i=in.nextInt();
			System.out.println("Enter second number");
			int j=in.nextInt();
			
			 if(i > j)
				 System.out.println(i+" is greater than "+j);
		  else
		         System.out.println(j+" is greaterthan "+i); 
		}

}