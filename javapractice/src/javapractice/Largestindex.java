package javapractice;
public class Largestindex {

	public static void main(String[] args) {
		int i;
		int ar[]= {4,3,2,5};
		System.out.println("beforr swap");
		//System.out.println(ar[0]);
		for( i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
			
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp =ar[i];
					ar[i]=ar[j];
					
					ar[j]=temp;
				}
			
			}
			
		}
		
		System.out.println("elements after sort");
		for( i=0;i<ar.length;i++) {
		
		System.out.println(ar[i]);
		
	}
		System.out.println(" 2nd largest element");
		
			System.out.println(ar[ar.length-2]);

		
}
}

