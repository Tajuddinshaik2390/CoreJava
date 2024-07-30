package outputstream;
import java.io.*;
public class demo1 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		try {
			FileOutputStream fos=new FileOutputStream("bc.txt");
			fos.write(7);
			System.out.println("data saved");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
