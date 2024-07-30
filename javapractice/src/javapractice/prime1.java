package javapractice;

public class prime1 {

	public static void main(String[] args) {
		int a=11;int count=0;
		for(int i=0;i<a;i++) {
			if(a%2==0) {
				count++;
			}
			
			}
		if(count==2) {
			System.out.println("it is prime");
		}
		else {
			System.out.println("not prime");
		}

	}

}
