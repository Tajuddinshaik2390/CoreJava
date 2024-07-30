import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class database2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        try
        {
            
            String url="jdbc:mysql://localhost:3306/office";
            String user="root";
            String pass1="1234";
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection conn = DriverManager.getConnection(url,user,pass1);
            System.out.println("connection establish");

           

            System.out.println("enter the empid");
            int empid =sc.nextInt();

            System.out.println("enter the name");
            String Ename =sc.next();

            System.out.println("enter the password");
            String pass=sc.next();

            System.out.println("enter the email");
            String email =sc.next();

            System.out.println("enter the mobile");
            long mobile =sc.nextLong();

            String qry="insert into table2 values(?,?,?,?,?)";

            PreparedStatement pt=conn.prepareStatement(qry);
            pt.setInt(1, empid);
            pt.setString(2, Ename);
            pt.setString(3, pass);
            pt.setString(4, email);
            pt.setLong(5, mobile);

            pt.executeUpdate();

            System.out.println("inserted successfully");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}