import java.sql.*;
public class insert1 {
public static void main(String args[]) {
	try {
		connection1 db=new connection1();
		int x=0;
		int y=0;
		int c=0;
		int x1=1;
		int y1=1;
		int c1=0;
		String st="insert into poleresult values('" + x + "','" + y + "'," + c + ")";
		db.stmt.executeUpdate(st);
		
		String st1="insert into poleresult values('" + x1 + "','" + y1 + "'," + c1 + ")";
		db.stmt.executeUpdate(st1);
		
	}
	catch(Exception e) {
		System.err.println(e);
	}
}
}
