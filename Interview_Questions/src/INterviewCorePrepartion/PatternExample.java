package INterviewCorePrepartion;

public class PatternExample {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			
			for (int j = n; j >= n; j--) {
				System.out.println("*");
			}
			System.out.println();
		}

	}
}