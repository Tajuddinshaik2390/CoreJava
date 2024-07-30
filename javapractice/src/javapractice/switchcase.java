package javapractice;
import java.util.*;

public class switchcase {
	 
	public static void main(String args[]) {
		 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st num");
	int num1=sc.nextInt();
	System.out.println("enter 2nd num");
	int num2=sc.nextInt();
	int ch=sc.nextInt();
	//System.out.println("which operation do u  want to perform");
	

	
	
	String operation=sc.nextLine();
	/*if(operation.equals("sum")) {
		System.out.printf("%f+%f=%f",num1,num2,num1+num2);
		
	}
	else if (operation.equals("sub")) {
		System.out.printf("%f-%f=%f",num1,num2,num1-num2);
		
	}**/
	switch(ch) {
	case 1: ch= num1+num2;
	System.out.println(ch);
	break;
	}
	switch(ch) {
	case 2: ch= num1-num2;
	System.out.println(ch);
	}
	switch(ch) {
	case 3: ch= num1*num2;
	System.out.println(ch);
	
	}
	defalt:
		System.out.println("WRONG OPTION");
	
	
	

}
}