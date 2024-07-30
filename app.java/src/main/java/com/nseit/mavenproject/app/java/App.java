package com.nseit.mavenproject.app.java;

class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void Text(){System.out.println("Welcome");}  
}  
class C extends A,B{
	void run(){
		System.out.println("running");//suppose if it were  
	}

}
   public class App{
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();//Now which msg() method would be invoked?  
} }

 