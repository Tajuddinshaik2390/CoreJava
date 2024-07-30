package OOPS;

public class prac3 {
	prac3 obj;
	private  static String firstname;
	private  static String lastName;
	
public 	prac3(){
		System.out.println("constructor called");
	}
	public prac3(String firstname ,String lastName) {
		this.firstname=firstname;
		this.lastName=lastName;
	}
	public static void main(String[] args) {
		prac3 obj=new prac3("taj","shaik");
		System.out.println(firstname+lastName);
		
	
	}

}
