package vechiles;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;
	
	import org.springframework.dao.DataAccessException;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.ResultSetExtractor;

	public class CustomerDao {
	private JdbcTemplate jd;
	public void setJdbcTemplate(JdbcTemplate jd) {
		this.jd=jd;
	}
	public int saveCustomer (Customer e) {
		
			 String qry="insert into employers values('" + e.getCid() + "', '" + e.getCname() + "', '" +e.getDriverno() + "','" + e.getAadhar()+"',"+e.getPhoneno()+")";
		        return jd.update(qry);
	}
		public List<Customer> showAll(){
			return jd.query("select * from employers",new ResultSetExtractor<List<Customer>>() {
				@Override
				public List<Customer> extractData(ResultSet rs) throws SQLException,DataAccessException{
					List<Customer> list=new ArrayList<Customer>();
					while(rs.next()) {
						Customer e=new Customer();
						e.setCid(rs.getString(1));
						e.setCname(rs.getString(2));
						e.setDriverno(rs.getString(3));
						e.setAadhar(rs.getString(4));
						e.setPhoneno(rs.getString(5));
					}
					return list;
				}
			});
		}
	}


