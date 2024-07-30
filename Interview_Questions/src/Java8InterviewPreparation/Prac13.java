package Java8InterviewPreparation;

public class Prac13 {
	public static void main(String[] args) {
		String name = "Taj shaik";
		String rev = reverse(name);
		System.out.println(rev);

	}

	public static String reverse(String name) {
		String data = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			data = data+ name.charAt(i);
		}
		return data ;

	}
}
