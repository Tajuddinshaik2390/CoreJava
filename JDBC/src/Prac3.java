import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prac3 {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/data_base","root","1234");
PreparedStatement ps=	con.prepareStatement("SELECT * FROM REGISTER");
 ResultSet rs=ps.executeQuery();
 while(rs.next()) {
	 String id=rs.getString("id");
	 System.out.println(id);
	 System.out.println(rs.getString("name"));
	 System.out.println(rs.getString("dept"));
	 System.out.println("--------------------------------------");
 }
}
}
