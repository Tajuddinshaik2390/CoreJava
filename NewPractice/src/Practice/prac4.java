package Practice;

public class prac4 {
 int age;

	public void m1(prac4 obj) {
		System.out.println("this is m1");
	
	}

	public void m2() {
		m1(this);
	}

	public static void main(String[] args) {
		prac4 obj = new prac4();
		obj.m1(obj);
	}

}
