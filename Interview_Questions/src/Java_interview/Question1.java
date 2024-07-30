package Java_interview;

public class Question1 {
public static void main(String[] args) {
	Integer num1=100;
	Integer num2=100;
	Integer num3=1100;
	Integer num4=new Integer(1100);
	if(num1==num2) {
		System.out.println("num1=num2");
		
	}else {
		System.out.println("num1!=num2");
		
		
	}
	if(num3.equals(num4)) {
		System.out.println("num3=num4");
		
	}else {
		System.out.println("num3!=num4");
	}
}
}
