package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc_Practice {
	public static void main(String[] args) throws Exception {
		String name = "taj";
		int id = 1;
		String email = "taj@gmail";

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/REGISTER", "root", "1234");
		System.out.println("connected success");
		PreparedStatement ps = con.prepareStatement("insert into registerform values(?,?,?)");// called positional
																								// parameters

		ps.setLong(1, id);
		ps.setString(2, name);
		ps.setString(3, email);

		PreparedStatement ps2 = con.prepareStatement("insert into registerform values('2','ammi','')");
		int i = ps.executeUpdate();
		int i2 = ps2.executeUpdate();

		if (i > 0)//if query executed successfully then the value always greater than zero
			System.out.println("successfully loaded");

		else
			System.out.println("not loaded");
		PreparedStatement pss = con.prepareStatement("select * from registerform");
		ResultSet rs = pss.executeQuery();
		System.out.println(rs);

	}
}
