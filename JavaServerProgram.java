package core_basics;
import java.io.*;
import java.net.*;

public class JavaServerProgram {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8010);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String st=(String)dis.readUTF();			
			System.out.println("message from client"+st);
			s.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
