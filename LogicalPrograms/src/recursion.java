

interface printable{  
void print(); 
void eat();

}  
 class recursion implements printable{  
public void print(){
	System.out.println("Hello");
	}  
  public void eat() {
	  System.out.println("eating");
  }
 
 
  
public static void main(String args[]){  
recursion obj = new recursion();  
obj.print(); 
obj.eat();
}

 }

 