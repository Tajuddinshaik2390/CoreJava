package FunctionalInterface;

@FunctionalInterface
interface impp {

	 //void message(String m);
void message();	 
}

public class Prac1  {
	
	public static void main(String[] args) {
		
		//Prac1 a=new Prac1();
	//a.message("helo world");
//	}
//
//	@Override
//	public void message(String m) {
//		System.out.println(m);
		 impp imp=( )->{System.out.println("hell");
					 };
					 

		imp.message();
		
		
		 
	}
}
