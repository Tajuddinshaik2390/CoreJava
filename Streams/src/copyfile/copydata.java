package copyfile;
import java.io.*;
public class copydata {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		try {
			FileInputStream fis=new FileInputStream("D:\\Users\\tajuddins\\eclipse-workspace\\Streams\\src\\copyfile");
			int data=fis.read();
			System.out.println(data);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
