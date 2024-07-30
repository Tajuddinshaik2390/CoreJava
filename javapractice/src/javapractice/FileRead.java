package javapractice;

import java.io.File;

public class FileRead {
public static void main(String args[]) {
	File f=new File("C:\\Users\\tajuddins\\Desktop\\t.txt");
	if (f.exists())
	{
		System.out.println(f.canExecute());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.length());
		System.out.println(f.canRead());
		System.out.println(f.getTotalSpace());
		
		
		
	}
}
}
