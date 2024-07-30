package Collections;

import java.util.Stack;

public class Spractice {
	
	
	
public static void main(String[] args) {
	Stack<String> s=new Stack<>();
	
s.push("taj");
s.push("ammi");
s.push("khaja");
System.out.println(s);
System.out.println(s.capacity());
s.pop();
System.out.println(s);
System.out.println(s.peek());	
System.out.println(s.search("taj"));
System.out.println(s.indexOf("taj"));

}
}
