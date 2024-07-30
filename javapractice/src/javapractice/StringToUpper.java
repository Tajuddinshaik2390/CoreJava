package javapractice;

public class StringToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="taj";
String str2="";
//int arr[]=new int[str.length()];
//for(int i=0;i<arr.length;i++) {
//	arr[i]=(int)str.charAt(i)-32;
//}
//for(int i=0;i<arr.length;i++) {
//	str2=str2+(char)arr[i];
//}
//System.out.println(str2);
int i;
int arrr[]=new int[str.length()];
	for( i=0;i<arrr.length;i++) {
		arrr[i]=(int)str.charAt(i)-32;
	}
	
	for( i=0;i<arrr.length;i++) {
		str2=str2+(char)arrr[i];
	}
	System.out.println(str2);
		
}

	}



