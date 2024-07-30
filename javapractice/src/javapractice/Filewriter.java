package javapractice;
import java.io.*;

public class Filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		FileWriter f=new FileWriter("C:\\Users\\tajuddins\\Desktop\\t.txt");
		try{
			f.write("java is the best\n");
			f.write("java is good");
		}
			finally {
		
			f.close();
			}
		
		System.out.println("successfully wrote");
	}
catch(IOException i) {
	System.out.println(i);
}

}
}
