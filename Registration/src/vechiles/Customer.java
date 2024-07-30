package vechiles;

public class Customer {
	String Cid,Cname,Driverno,Aadhar,Phoneno;
	public Customer() {
		
	}
	public Customer(String Cid,String Cname,String Driverno,String Aadhar,String Phoneno ) {
		this.Cid=Cid;
		this.Cname=Cname;
		this.Driverno=Driverno;
		this.Aadhar=Aadhar;
		this.Phoneno=Phoneno;
	}
	public String getCid() {
		return Cid;
	}
	public void setCid(String cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getDriverno() {
		return Driverno;
	}
	public void setDriverno(String driverno) {
		Driverno = driverno;
	}
	public String getAadhar() {
		return Aadhar;
	}
	public void setAadhar(String aadhar) {
		Aadhar = aadhar;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
public void show() {
	System.out.println("Cid:"+getCid());
	System.out.println("Cname:"+getCname());
	System.out.println("Driverno:"+getDriverno());
	System.out.println("Aadhar:"+getAadhar());
	System.out.println("Phoneno:"+getPhoneno());
}
		public String toString() {
			return Cid+"\t"+Cname+"\t"+Driverno+"\t"+Aadhar+"\t"+Phoneno;
		}
}
	