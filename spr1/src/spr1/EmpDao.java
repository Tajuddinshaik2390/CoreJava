package spr1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmpDao {
private JdbcTemplate jd;
public void setJdbcTemplate(JdbcTemplate jd) {
	this.jd=jd;
}
public int saveEmp(Emp e) {
	
		 String qry="insert into employers values('" + e.getName() + "', '" + e.getPass() + "', " +e.getsal() + ")";
	        return jd.update(qry);
}
	public List<Emp> showAll(){
		return jd.query("select * from employers",new ResultSetExtractor<List<Emp>>() {
			@Override
			public List<Emp> extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<Emp> list=new ArrayList<Emp>();
				while(rs.next()) {
					Emp e=new Emp();
					e.setName(rs.getString(1));
					e.setPass(rs.getString(2));
					e.setSal(rs.getString(3));
					list.add(e);
				}
				return list;
			}
		});
	}
}
