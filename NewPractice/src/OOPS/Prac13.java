package OOPS;

public class Prac13 {

	private  String name;
	private  String dept;
	private   String company="NSEIT";

	public Prac13(String name, String dept) {
		this.name = name;
		this.dept = dept;
		

	}
	public void show() {
		System.out.println(name+" "+dept+" "+company);
	}

	public static void main(String[] args) {
		Prac13 obj = new Prac13("taj", "ADM");
		Prac13 obj2 = new Prac13("salman", "ADM");
		obj.show();
		obj2.show();
		
	}
}
