package javapractice;
import java.util.*;
public class Array4 {
	
public static void main(String args[]) {
	int i;
	int arr[]=new int [5];
	Scanner sc=new Scanner(System.in);
	
	for( i=0;i<arr.length;i++) {
	arr[i]=	sc.nextInt();
	
		
	}
	for( i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	
	
}
	System.out.println(Arrays.toString(arr));
	System.out.println(arr.length);
}
}
