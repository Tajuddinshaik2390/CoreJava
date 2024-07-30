package javapractice;
import java.io.*;

public class filewriter2 {

	public static void main(String[] args) throws Exception{
		
		try {
			Writer f=new FileWriter("C:\\Users\\tajuddins\\Desktop\\demo.txt");
			BufferedWriter fp= new BufferedWriter(f);
			fp.write("bcgdf"+""+"/n");
			//fp.newLine();
			fp.write("gbcdh");
			fp.close();
		}
		catch(IOException i) {
			System.out.println(i);
		}

	}

}
