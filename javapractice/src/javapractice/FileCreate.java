package javapractice;
import java.io.File;
import java.io.IOException;
import java.lang.*;
public class FileCreate {
public static void main(String args[]) {
	File f=new File("C:\\Users\\tajuddins\\Desktop\\t.txt");
	try {
		if(f.createNewFile()) {
			System.out.println("file is created ");
		}
		else {
			System.out.println("file exists");
		}
	}
	catch(IOException i){
		System.out.println("exception handled");
	}

}
}
