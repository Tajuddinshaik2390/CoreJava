package Practice;

public class prac2 {
public void show() {
	System.out.println("this is show method");
}


public void display() {
	show();
}
public static void main(String[] args) {
	prac2 p=new prac2();
	p.display();
}
}
