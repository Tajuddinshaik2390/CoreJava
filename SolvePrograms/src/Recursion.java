public class Recursion{
	
	public static void main(String[] args) {
		
		int n=153;
	 int x=n;
		int digit=0;
		while(n>0) {
			n=n/10;
			digit=digit+1;
		}
		double res=0;
while(x>0) {
	int rem=x%10;
	double r=(double)rem;
	res=res+Math.pow(r, digit);
	x=x/10;
	
}
if(res==153) {
System.out.println("is true");
	}else {
		System.out.println("false");
	}
	}
	
	
	
	
	/*public static void main(String args[]) {
		int n1=0;
		System.out.println(n1);
		int n2=1;
		System.out.println(n2);
		int n3=n1+n2;
		System.out.println(n3);
		while(n3<100){
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.println(n3);
			
		}
		
		
	}*/
}



