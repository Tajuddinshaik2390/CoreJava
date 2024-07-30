package spr1;

public class Emp{
	String name,pass,sal;
	public Emp() {
		
	}
	public Emp(String name,String pass,String sal) {
		this.name=name;
		this.pass=pass;
		this.sal=sal;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getsal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}
    public void show() {
    	System.out.println("Name"+getName());
    	System.out.println("Password"+getPass());
    	System.out.println("Salary"+getsal());
    }
	
	public String toString() {
		return name+"\t"+pass+"\t"+sal;
	}
}




	