import java.util.Scanner;

public class Perfectnumber {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter any integer you want to check");
		 n=sc1.nextInt();
		 for(int i=2; i*i<n;  i++)
		 {
			 if(n%2==0)
				 sum=sum+i;
			 
		 }
	
		 if(sum==n)
		 {
			 System.out.println("number is a perfect number");
		 }
		 else
			 System.out.println("number is a not perfect number");
		 
		 }
}