package javapractice;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
//int i=0;
	//System.out.println("enter elements");
	int Arr[]=new int[6];
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<Arr.length;i++){
		Arr[i]=sc.nextInt();
		
	}
	System.out.println("array elements");
	for(int i=0;i<Arr.length;i++){
		
		System.out.println(Arr[i]);
	
	
	}
	System.out.println("reverse elements");
for(int i=Arr.length-1;i>=0;i--){
		
		System.out.println(Arr[i]);
	
}
}
}
