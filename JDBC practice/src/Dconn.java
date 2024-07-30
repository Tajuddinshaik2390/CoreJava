import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Dconn {

    public Connection conn;
    public Statement stat;
    public ResultSet rs;

        public Dconn() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","1234");
                stat=conn.createStatement();
            }
            catch(Exception e) {
                System.out.println(e); 
            }
        }
}