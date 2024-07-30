package javapractice;

public class Find1 {

	public static void main(String[] args) {
		int ar[]= {3,5,6,7,5,6,7};
		int res=ar[0];
	for(int i=1;i<ar.length;i++) {
		res=res^ar[i];
		
	}
	System.out.println("single repeat element is"+res);
	}

}
