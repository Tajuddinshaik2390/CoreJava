package oops2;
class Animal {  
	   void eat()
	   {
		   System.out.println("eating...");
		   }  
	 }  
	   class Dog extends Animal
	   {  
	   void eat()
	   {
		   System.out.println("eating bread...");
		   }  
	  }  
	 class tiger extends Animal{  
	   void eat() 
	   {
		   System.out.println("eating deer...");
		   }  
	  }  
	class Lion extends Animal {  
	void eat() 
	{
		System.out.println("eating meat...");
		}  
	 }  
	public class Polymorphism2
	{	
	public static void main(String[] args){  
	  Animal a;  
	  a=new Dog();  
	  a.eat();  
	  a=new tiger();  
	  a.eat();  
	  a=new Lion();  
	  a.eat();  
	   }
	 }