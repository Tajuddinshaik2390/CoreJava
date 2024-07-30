package javapractice;

public class Array5 {

	public static void main(String[] args) {
		String strr="Taj";
		String strr1="";
		for(int i=0;i<strr.length();i++) {
			System.out.println("characters at each index");
			System.out.println(strr.charAt(i));
		}
		System.out.println("full string");
		System.out.println(strr);
		strr1=strr;
		System.out.println("reverse string");
		for(int i=strr.length()-1;i>=0;i--) {
			System.out.println(strr.charAt(i));
		
	}
	}
}
