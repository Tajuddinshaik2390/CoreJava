package javapractice;

public class Array2 {
public static void main(String args[]) {
	String st= "tajuddin";
	StringBuffer ans=new StringBuffer();
	String ans1="";
//	for(int i=0;i<st.length;i++) {
//		ans =st[i];
//		
//	
//	}
//	System.out.println(ans);
for(int i=st.length()-1;i>=0;i--) {
	ans.append(st.charAt(i));
	ans1=ans1+st.charAt(i);
	
}
System.out.println(ans);
System.out.println(ans1);
}
}
