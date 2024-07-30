package javapractice;

public class String1 {

	public static void main(String[] args) {
		String st = "tajuddin Shaik is a lover boy";
//		char ch = 'i';
//		int count = 0;
//		int i;
//		for ( i = 0; i < st.length(); i++) {
//			if (st.charAt(i) == ch) {
//				count++;
//			}
//		}
//		System.out.println(count);

//		String st2 = "";
//		for (int i = 0; i < st.length(); i++) {
//			if (st.charAt(i) == ' ') {
//				// continue;
//				break;
//			}
//			st2 = st.charAt(i) + st2;
//
//		}
//		System.out.println(st2);
//		// count number of spaces in a string
		
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt( i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
