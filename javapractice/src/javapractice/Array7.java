package javapractice;

import java.util.Arrays;

public class Array7 {
	
	static void secondlargest(int arr[],int n) {
		int i;
	 Arrays.sort(arr);
	 for( i=n-1;i>=0;i--) {
		 System.out.println(arr[i]);
	 }
	 System.out.println("the second largest is "+arr[n-2]);
	}

	public static void main(String[] args) {
	int arr[]= {3,7,8,1};
	int n=arr.length;
		secondlargest(arr,n);
	}

}
