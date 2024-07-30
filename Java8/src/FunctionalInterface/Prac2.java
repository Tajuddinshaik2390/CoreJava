package FunctionalInterface;

import java.util.Scanner;

public class Prac2 {
	
	
	public  void ad(int a,int b) {
		System.out.println(a+b);
	}
public static void main(String[] args)
{
//int sum=0;
//int num;
//	System.out.println("enter num of numbers");
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt();
//	for(int i=0;i<n;i++) {
//		System.out.println("enter num");
//		 num=sc.nextInt();
//		 sum =sum+num;
//		
//	}
//	System.out.println("sum of given nums "+sum);
	
	int x = Integer.parseInt(args[0]); //first arguments   
	int y = Integer.parseInt(args[1]); //second arguments  
	int sum = x + y;  
	System.out.println("The sum of x and y is: " +sum);  
}
}










