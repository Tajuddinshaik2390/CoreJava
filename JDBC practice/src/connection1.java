import java.sql.*;
public class connection1 {
public Connection conn;
public Statement stmt;
public ResultSet rs;
public ResultSetMetaData md;
public connection1() {
	try {
		Class.forName("com.Mysql.jdbc.Driver");
		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/poling","root","1234");
		 stmt=conn.createStatement();
	}
	catch(Exception e){
		System.err.println(e);
	}
}
}
