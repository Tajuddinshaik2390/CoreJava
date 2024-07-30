package javapractice;
import java.util.*;

public class sort1 {
public static void main(String args[]) {
	int ar[]=new int [3];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter elements");
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
		//System.out.println("before sort");
	for(int i=0;i<ar.length;i++) {
		
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]>ar[j]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	System.out.println("after sort");
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
}
}
