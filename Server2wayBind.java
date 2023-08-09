package core_basics;
import java.io.*;
import java.net.*;
public class Server2wayBind {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8121);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dops=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";
		while(!dis.equals("stop")) {
			str=dis.readUTF();
			System.out.println("client sends "+str);
	      str2=br.readLine();
	      dops.writeUTF(str2);
	      dops.flush();
	      dis.close();
			s.close();
			ss.close();
			
		}
		
		
		
		}
		catch(Exception e) {
			
		}
	}

}
