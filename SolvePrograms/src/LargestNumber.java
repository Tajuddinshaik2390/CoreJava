import java.util.*;
public class LargestNumber {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);	
int number1=sc.nextInt();
int number2=sc.nextInt();
int number3=sc.nextInt();
if(number1 > number2 && number1 > number3)
{
System.out.println("num1 is biggest");

}
else if(number2> number3)
{
	System.out.println(" num2 is biggest");

}
else {
	System.out.println(" num3 is bigger");
}
}
}
