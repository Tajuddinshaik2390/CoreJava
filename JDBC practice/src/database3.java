import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class database3{
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

            String qry="delete from table2 where empid=?";

            PreparedStatement pt=conn.prepareStatement(qry);
            pt.setInt(1, empid);
            pt.executeUpdate();

            System.out.println("deleted successfully");
        }
        catch(Exception e){

            System.out.println(e);
        }
    }
}