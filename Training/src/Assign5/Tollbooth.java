package Assign5;
import java.util.Scanner;

public class Tollbooth {
  static int noOfVeh,tlAmount;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tollbooth tb=new Tollbooth();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Which Car?  n1.PayCar!,n2.No PayCar!,3.Display!");
		    System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				tb.payCar();
				break;
			case 2:
				tb.noPayCar();
				break;
			case 3:
				tb.display();
				System.exit(0);
		}
		
		}
		while(true);
	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println("Total Number Of Vehicles -->"+noOfVeh);
		System.out.println("Total Money Collected -->"+tlAmount);
	}

	private void noPayCar() {
		// TODO Auto-generated method stub
		  noOfVeh++;
	}

	private void payCar() {
		// TODO Auto-generated method stub
	    noOfVeh++;
	    tlAmount+=100;
	}

}
