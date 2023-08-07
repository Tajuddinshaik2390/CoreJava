package core_basics;
import java.io.*;
import java.net.*;


public class JavaSocketProgram {
public static void main(String args[] ){
	try {
		Socket s=new Socket("localhost",8010);
		DataOutputStream dops=new DataOutputStream(s.getOutputStream());
		dops.writeUTF("hello server");
		dops.flush();
		dops.close();
		
	}
catch (Exception e) {
	System.out.println(e); 
}
	
}
}
