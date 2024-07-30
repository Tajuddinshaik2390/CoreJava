package Java8InterviewPreparation;

public class Prac12 {
	public static void main(String[] args) {
		// String name="TAJ SHAIK";
		String reverseData = reverDta("TAJ SHAIK");
		System.out.println(reverseData);

	}

	public static String reverDta(String name) {
		char array[] = name.toCharArray();
		int left = 0, right = name.length() - 1;
		while (left < right) {
			char temp=array[left];
			array[left] = array[right];
			array[right] = temp;
			

			left++;
			right--;
		}
		return new String(array);
	}

}
