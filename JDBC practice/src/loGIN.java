import java.sql.*;
public class loGIN {
         public Connection conn;
         public Statement stat;
         public ResultSet rs;
         public void Dconn() {
        	 Class.forName("com.mysql.jdc.Driver");
        	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/patient","root","1234");
        	 stat = conn.createStatement();
         }
         catch(Exception e) {
         System.out.println(e);
	}
}

