package core_basics;
import java.util.*;

public class Switchprgms2 {

	public static void main(String[] args) {
		System.out.println("enter month number");
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		
		for( int i=j;i<=j;i++) {
			switch(i) {
			case 1:System.out.println("its a january"); 
			break;
			
			case 2:System.out.println("its a feb"); 
			break;
			case 3:System.out.println("its a mar"); 
			break;
			case 4:System.out.println("its a apr"); 
			break;
			case 5:System.out.println("its a may"); 
			break;
			case 6:System.out.println("its a jun"); 
			break;
			case 7:System.out.println("its a july"); 
			break;
			case 8:System.out.println("its a aug"); 
			break;
			case 9:System.out.println("its a sep"); 
			break;
			case 10:System.out.println("its a oct"); 
			break;
			case 11:System.out.println("its a nov"); 
			break;
			case 12:System.out.println("its a dec"); 
			break;
			default :System.out.println("end of months"); 
			break;
			
			
			}
		}

	}

}
