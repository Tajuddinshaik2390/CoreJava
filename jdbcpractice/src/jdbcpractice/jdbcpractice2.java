package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class jdbcpractice2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "1234");
		System.out.println("connection done");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the login data");
		String name = sc.nextLine();
		double salary = sc.nextDouble();
		int id = sc.nextInt();

		PreparedStatement ps = con
				.prepareStatement("insert into new_data values('" + name + "','" + salary + "','" + id + "')");
		// ps.setInt(1,id);
		// ps.setString(2,name);
		// ps.setDouble(3,salary);

		int data = ps.executeUpdate();
		con.close();

	}

}
