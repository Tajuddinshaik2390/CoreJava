import java.sql.*;
public class jdbc2 {
public static void main(String args[]) {
	String url=("jdbc:mysql://localhost:3306/office");
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
         String sql="insert into details values('prashant','mumbai','m')";
         
         stmt.executeUpdate(sql);
         String sql1="insert into details values('mani','mumbai','m')";
         stmt.executeUpdate(sql1);
         String sql2="insert into details values('sareetha','mumbai','F')";
         stmt.executeUpdate(sql2);
         //close the connection()
         conn.close();
		}catch (SQLException e) {
	System.out.println("one query executed");}}
	

}

