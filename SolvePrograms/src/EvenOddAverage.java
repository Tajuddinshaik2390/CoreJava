import java.util.*;
public class EvenOddAverage {
	
		
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
		int num=sc.nextInt();
		
		int cntEven=0,cntOdd=0,sumEven=0,sumOdd=0; 
		while(num > 0){
			if(num%2==0){
		cntEven++;
		sumEven = sumEven + num; 
		} 
		else
		{
		 
		cntOdd++;
		sumOdd = sumOdd + num;
		}
		num--; 
		}
		int evenAvg,oddAvg;
		evenAvg = sumEven/cntEven;
		oddAvg = sumOdd/cntOdd; 
		System.out.println("Average of first N Even no is "+evenAvg); 
		System.out.println("Average of first N Odd no is "+oddAvg);
		} 
}