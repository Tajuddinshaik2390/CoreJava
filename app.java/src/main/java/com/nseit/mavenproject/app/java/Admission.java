package com.nseit.mavenproject.app.java;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.util.Scanner;

	public class Admission  {

		private long paidfee;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner (System.in);
			
			try
			{
				//dbCon db=new dbCon();
				String url="jdbc:mysql://localhost:3306/data";
				String user="root";
				String pass1="1234";
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("driver loaded");
				
				Connection conn = DriverManager.getConnection(url,user,pass1);
				System.out.println("connection establish");
				
				
				System.out.println("enter the sid");
				int s_id =sc.nextInt();
				
				System.out.println("enter the name");
				String cname =sc.next();
				
		        System.out.println("enter the paidfee");
				int paidfee =sc.nextInt();
				
				String qry="insert into fees values(?,?,?)";
				
				PreparedStatement pt=conn.prepareStatement(qry);
		        pt.setInt(1, s_id);
		        pt.setString(2, cname);
		        pt.setLong(3, paidfee);
		        
				pt.executeUpdate();
				  System.out.println("admission done successfully");
				}
			catch(Exception e)
			{
				System.out.println(e);
			}



		}

	}


