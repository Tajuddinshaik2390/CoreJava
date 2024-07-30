class Student{
	String name;
	int age;
	String adress;
	public  Student(String name,int age,String adress) {
		this.name=name;
		this.age=age;
		this.adress=adress;
	}
	public void setName(String name) {
		this.name=name;
		
		}
	public void setAge(int age) {
		this.age=age;
		
	}
	public void setAdress(String adress) {
		this.adress=adress;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
		
	}
	public String getAdress(){
	return adress;	
	}
	}
	
public class practice1 {
	public static void main(String args[]) {
		Student S = new Student("taj",24,"23 east,california ");
		System.out.println(S.getName());
	}

}
