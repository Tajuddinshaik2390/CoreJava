package com.nseit.mavenproject.app.java;
	package com.nseit.mavenproject.app.java;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.util.Scanner;

	public class Student {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner (System.in);
			try
			{
				//dbCon db=new dbCon();
				String url="jdbc:mysql://localhost:3306/studentdata";
				String user="root";
				String pass1="1234";
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("driver loaded");
				
				Connection conn = DriverManager.getConnection(url,user,pass1);
				System.out.println("connection establish");
				
				//Statement stat=conn.createStatement();
				//System.out.println("connected");
				
				
				System.out.println("enter the sid");
				int s_id =sc.nextInt();
				
				System.out.println("enter the name");
				String sname =sc.next();
				
				System.out.println("enter the email");
				String email =sc.next();
				
				System.out.println("enter the mobile");
				long phone =sc.nextLong();
				
				String qry="insert into stud values(?,?,?,?)";
				
				PreparedStatement pt=conn.prepareStatement(qry);
		        pt.setInt(1, s_id);
		        pt.setString(2, sname);
		        pt.setString(3, email);
		        pt.setLong(4, phone);
		        
				pt.executeUpdate();
				  System.out.println("inserted successfully");
				}
			catch(Exception e)
			{
				System.out.println(e);
			}


		}

	}

}
