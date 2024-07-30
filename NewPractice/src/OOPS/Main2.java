package OOPS;

 abstract class dummy {
	  void show() {
		System.out.println("2");
	}
	  abstract void see();
	  
}

class Main2 extends dummy {
	public void show() {
		super.show();
		System.out.println("1");
	}

	public static void main(String[] args) {
		Main2 m = new Main2();
		m.show();

	}

	@Override
	void see() {
		// TODO Auto-generated method stub
		
	}

}
