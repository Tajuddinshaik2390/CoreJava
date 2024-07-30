package INterviewCorePrepartion;

import java.util.Arrays;

public class BooleanArray {

	public static void main(String[] args) {
		boolean data = true;
		boolean b[] = new boolean[10];
		for (int i = 0; i < b.length; i++) {
			b[i] = i % 2 == 0;

		}
		System.out.println(Arrays.toString(b));

	}
}
