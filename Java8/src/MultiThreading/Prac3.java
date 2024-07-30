package MultiThreading;

public class Prac3 {
public static void main(String[] args) {
	Thread t=new Thread("my thread");
	String s=t.getName();
	System.out.println(s);
}
}
