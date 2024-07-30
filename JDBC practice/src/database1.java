import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;
public class database1 {
                                                                    
    public static void main(String[] args) {
       

        try {
            Dconn d = new Dconn();

         System.out.println("connected successfully");
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the empid:");
         int E_id=sc.nextInt();
         System.out.println("enter the password:");
         String pass=sc.next();

         String qry= "insert into details values(" + E_id + ", '" + pass+ "')";

         d.stat.executeUpdate(qry);
         System.out.println("data inserted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}