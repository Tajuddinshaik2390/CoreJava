
public class Student4 {
	
	   int id;  
	    String name;
	    float id1;
	    //creating a parameterized constructor  
	    Student4(int id,String name){  
	   this. id = id;  
	    this.name = name;  
	    this.id1=id1;
	    }  
	    //method to display the values  
	    void display(){
	    	System.out.println(id+" "+name+" "+id1);
	    	}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    Student4 s1 = new Student4(111,"Karan",2.1f);  
	    Student4 s2 = new Student4(222,"Aryan",4.2f);  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	}  


