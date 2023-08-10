package core_basics;
import java.io.*;
import java.net.*;

public class Socket2wayBind {
public static void main(String args[]) {
	
	try {
		Socket s=new Socket("localhost",8121);
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dops=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str="",str2="";
		while(!dis.equals("stop")) {
			str=br.readLine();
			dops.writeUTF(str);
			dops.flush();
			str2=dis.readUTF();
			System.out.println("server sends "+str2);
			dops.close();
			s.close();
		
		}
		
		
	}
	catch(Exception e) {
		
	}
}
}
