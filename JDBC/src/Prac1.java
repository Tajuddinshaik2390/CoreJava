import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prac1 {

	public static void main(String[] args) throws Exception {
		int id = 2;
		String name = "subani";
		String dept = "ece";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_base", "root", "1234");
		PreparedStatement p = con.prepareStatement("insert into register values(?,?,?)");
		p.setInt(1, id);
		p.setString(2, name);
		p.setString(3, dept);

		int data = p.executeUpdate();
		if (data > 0) {
			System.out.println("succes");
		} else {
			System.out.println("failed");
		}
	}
}
