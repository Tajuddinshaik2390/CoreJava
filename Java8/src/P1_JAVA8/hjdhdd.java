package P1_JAVA8;

public class hjdhdd {
	 int age;
	 public hjdhdd(int age) {
	this.age=age;
	}
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age=age;
	 }
	 
public static void main(String[] args) {
	
	hjdhdd a=new  hjdhdd(24);
	a.setAge(25);
	System.out.println(a.getAge());
	
	
}
}
