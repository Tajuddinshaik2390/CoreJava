package P1_JAVA8;

public class MethodReference {
public static void main(String[] args) {
//	Test k=new Test();
//	OwnFI obj=k :: ImplementationOfFI;
//	obj.hello();
	

}

public  static class Test{
	  void ImplementationOfFI() {
		System.out.println("this is your implementation of OWNFI");
}
	
}

}
//if i dont have a implementation of my functional interface then i should use lamda expressions remember

//OwnFI obj =()-> System.out.println("This is your implementation of OWNFI ");
//obj.hello();
//