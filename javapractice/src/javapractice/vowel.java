package javapractice;
import java.util.*;
public class vowel {

	public static void main(String[] args) {
		System.out.println("enter character");
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
char ch;
ch=sc.next().charAt(0);

if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' || ch =='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
	System.out.println("it is vowel");
	
}
else {
	System.out.println("it is consonant");
}
	}

}
