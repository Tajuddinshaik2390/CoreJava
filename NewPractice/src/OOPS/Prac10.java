package OOPS;

class   bacha {
	static void show() {
		System.out.println("its bacha");
	}
}

public class Prac10 extends bacha {

static  void show() {

		System.out.println("its parent");
	}

	public static void main(String[] args) {
		//bacha p = new bacha();
		bacha.show();
		//p.show();
	}
}
