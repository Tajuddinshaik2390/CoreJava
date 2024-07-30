package oops2;
class Animal2 {
	 
    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}
 
class cat extends Animal2 {
 
    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat d1 = new cat();
        Animal2 a1 = new Animal2();
 
        d1.eat();
        a1.eat();
 
        Animal2 animal = new cat();
        // eat() method of animal class is overridden by
        // base class eat()
        animal.eat();
	}
}