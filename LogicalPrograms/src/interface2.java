interface printable{
	void print();	
}
interface showable{
	void print();
}
class interface2 implements printable,showable{
	
public void print() {
	System.out.println("printing name");
}
public void print() {
	System.out.println("showing name");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
interface2 in=new interface2();
in.print();
///in.show();
	}
}

