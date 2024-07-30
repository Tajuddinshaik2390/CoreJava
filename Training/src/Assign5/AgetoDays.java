package Assign5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgetoDays {

	public static void main(String[] args) {
		LocalDate d1=LocalDate.now();
		System.out.println(d1);
		LocalDate dob=LocalDate.of(1997,12,23);
		System.out.println(dob);
		long days=ChronoUnit.DAYS.between(dob,d1);
		System.out.println(days);
		int hours=(int) (24 * days);
		int min=hours * 60;
		
		System.out.println("minutes is: "+min);
	}

}
