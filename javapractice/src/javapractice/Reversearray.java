package javapractice;

import java.util.*;

public class Reversearray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4,5};
//		//int arr1[]=new int [arr.length];
////		for(int i=0;i<arr.length;i++) {
////			System.out.println(arr[i]);
////		}
//		for(int i=arr.length-1;i>=0;i--) {
//			//System.out.println(arr[i]);
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					
//				}
//			}
//			}
//		System.out.println(Arrays.toString(arr));
//		
//	}
		int i = 0;
int temp;
		int j = arr.length - 1;
		while (i < (arr.length)/2 && j >= (arr.length)/2) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			
		}
		for( i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
		}
		
		//System.out.println(Arrays.toString(arr[i]));
	}
}
