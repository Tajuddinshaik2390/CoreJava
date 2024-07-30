package Filehandling;
import java.io.*;

public class Copyfile{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fi;
		FileOutputStream fo;
		try {
			fi=new FileInputStream("D:\\Users\\tajuddins\\eclipse-workspace\\Practice\\src\\Practiceprograms\\strings1.java");
			fo = new FileOutputStream("D:\\Users\\tajuddins\\eclipse-workspace\\Practice\\taj2.txt");
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		  return;
		  
		}
		int i;
		do {
			i = fi.read();
			if(i!=-1)
			{
				fo.write((char)i);
			}
		}while(i != -1);
		fi.close();
		
		System.out.println("Copied");
	}

}
