package inputstreams;

import java.io.*;

public class demo1 {
public static void main(String args[]) throws  FileNotFoundException,IOException{
	try{
		FileInputStream fis=new FileInputStream("filee");
		
		int data=fis.read();
		System.out.println(data);
fis.close();
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	
}
}



