package oops2;
class Animal1
{
public void printA(){
	
		System.out.println("Animal is running");
	}
}
class Dogs extends Animal1
{
	 public void printD()
	{
		System.out.println("Dogs is barking");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dogs d=new Dogs();
       
       d.printD();
       d.printA();
	}
}