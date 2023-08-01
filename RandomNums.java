package core_basics;
import java.util.Random;

public class RandomNums {
public static void main(String[]args) {
	//creating instance of random class
Random random=new Random();
int x=random.nextInt();
System.out.println(x);
double y=random.nextDouble();
System.out.println(y);
boolean z =random.nextBoolean();
System.out.println(z);
}
}
