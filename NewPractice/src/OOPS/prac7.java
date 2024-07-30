package OOPS;

public class prac7 {
	public void show(String name) {
		System.out.println("1st");
		
		
	}
	public void show(String... name) {
		System.out.println("2nd");
		
	}
	
public static void main(String[] args) {
	prac7 obj=new prac7();
	obj.show("edede","sddeded");
	//obj.show(null);
	//obj.show(new StringBuffer("skk"));
}
}
