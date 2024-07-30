package Java_interview;
class example{
	public int age;
	

public example(int age) {
	this.age=age;
	
}

public void normalMethod(example obj) {
	System.out.println("Value of the passed object  "+obj.age);
}

public void methodUsingthis() {
	normalMethod(this);
}
}
public class Question2 {
	public static void main(String[] args) {
		example obj=new example(1);
		example obj2=new example(2);
		obj.methodUsingthis();
		obj2.methodUsingthis();
	}

}
