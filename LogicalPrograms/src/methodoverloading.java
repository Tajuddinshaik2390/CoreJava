 class Adder{
	  static int Add(int a,int b) {
 
	 return a+b;
 }
	  static double Add(int a,int b) {
		  return a-b;
	  }
 }
public class methodoverloading {
	public static void main(String args[]) {
		System.out.println(Adder.Add(2,3));
	}

}
