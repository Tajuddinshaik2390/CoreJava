import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class exmp1 {
	public static void main(String args[]) {
		//String driver=("com.mysql.jdbc.Driver");
		String url=("jdbc:mysql://localhost:3306/hospital");
		String username="root";
		String password="1234";
	
		try {	
		//register the driver
		//Class.forName(driver);
		//get the connection
		Connection conn=DriverManager.getConnection(url,username,password);
		//create the statement
         Statement stmt=conn.createStatement();
         //execute the query
         String sql="insert into patient values('prashant','mumbai','m')";
         
         stmt.executeUpdate(sql);
         String sql1="insert into patient values('mani','mumbai','m')";
         stmt.executeUpdate(sql1);
         String sql2="insert into patient values('sareetha','mumbai','F')";
         stmt.executeUpdate(sql2);
         //close the connection()
         conn.close();
		}catch (SQLException e) {System.out.println();}}
	

}
