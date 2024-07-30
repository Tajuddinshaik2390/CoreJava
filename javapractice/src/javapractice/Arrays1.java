package javapractice;

import java.util.Arrays;

public class Arrays1 {
public static void main(String args[]) {
int arr[]= {1,2,3,4};

//int copyofarr[]=Arrays.copyOf(arr,10);
int copyarr[]=Arrays.copyOf(arr,arr.length);
System.out.println(Arrays.toString(arr));
//Arrays.fill(arr,2);
System.out.println(Arrays.toString(copyarr));
System.out.println(Arrays.equals(arr,copyarr));
System.out.println(arr==copyarr);
//System.out.println(Arrays.toString(arr);

}
}
