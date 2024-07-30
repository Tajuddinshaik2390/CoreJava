package com.nseit.mavenproject.app.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class db1 {


    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        try {
            String url="jdbc:mysql://localhost:3306/office";
            String user="root";
            String pass="1234";

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver is loaded....");


            Connection con=DriverManager.getConnection(url, user, pass);
            System.out.println("connection  establish....");

            System.out.println("enter the empid");
            int empid=sc.nextInt();

            String qry="Select * from table2 where empid='"+empid+"'";

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(qry);

            if(rs.next())
            {
                System.out.println("Record already Exit...");
                do{
                    System.out.println(rs.getInt(1)+ ", "+rs.getString(2));
                }while(rs.next());
            }
            else{
                System.out.println(" New Record inserted...");
            }
        }

            catch (Exception e) {
                e.printStackTrace();
            }
}
}
    
