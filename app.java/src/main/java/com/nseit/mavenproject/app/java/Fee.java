package com.nseit.mavenproject.app.java;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.Scanner;

	public class Fee extends admission  {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        admission ad=new admission ();
			
			try
			{
				String url="jdbc:mysql://localhost:3306/data";
				String user="root";
				String pass1="1234";
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("driver loaded");
				
				Connection conn = DriverManager.getConnection(url,user,pass1);
				System.out.println("connection establish");
				
				System.out.println("connected");
				
				
					System.out.println("enter s_id \n1.s_id1\n2.s_id2\n3.s_id3\n4.exit");
					int choice=sc.nextInt();
					
					switch(choice) 
					{
					case 1:
						int x=2000;
						System.out.println("total fee paid="+x);
						int y=5000;
						System.out.println("java course fee="+y);
						int z=y-x;
						System.out.println("due fee for s_id="+z);
						break;
						
					case 2:
						int a=5000;
						System.out.println("total fee paid="+a);
						int b=7000;
						System.out.println("c course fee="+b);
						int c=b-a;
						System.out.println("due fee for s_id="+c);
						break;
						
					case 3:
						int a1=1500;
						System.out.println("total fee paid="+a1);
						int b1=5000;
						System.out.println("c++ course fee="+b1);
						int c1=b1-a1;
						System.out.println("due fee for s_id="+c1);
						break;
						
					case 4:
						System.out.println("exit");
						System.out.println("thank you");
						break;
					}
					}
			catch(Exception e)
			{
			
			}

	}
}
