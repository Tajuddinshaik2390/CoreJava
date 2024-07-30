package javapractice;

public class loops {
public static void main(String args[]) {
	int num[]= {1,2,3,4,5,6,7};
	int sum=0;
	for(int index=0;index<num.length;index++) {
		sum=sum+num[index];
		System.out.println(num[index]);
		
	}
	System.out.println(sum);
}
}
