package OOPS;

public class prac2 {

	String name;
	int age;

	public void SetData(String N, int A) {
		name = N;
		age = A;
		System.out.println("name "+name+"\n"+"Age  "+age);
	}

	public static void main(String[] args) {
prac2 obj=new prac2();
obj.SetData("TAJ",25);
	}
}
