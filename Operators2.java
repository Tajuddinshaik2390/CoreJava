package core_basics;
import java.util.*;

public class Operators2 {

	public static void main(String[] args) {
		 /*for keeping the variable static we use final keyword
		  * final int given;
		  * given=+8;
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the required  number");
	int	given=sc.nextInt();
	int i=0;
	
	do {
	given+=8;
	double Div=(given/3);
	double Mod=Div%5;
double	Result =Mod*5;
System.out.println(Result);
i++;

	}
while(given!=0) ;
		
	
}
	}
