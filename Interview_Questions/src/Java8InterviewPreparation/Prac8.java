package Java8InterviewPreparation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prac8 {
public static void main(String[] args) {
	int a[]= {2,7,3,3};
	int b[]=new int[] {3,7,6};
	int c[]=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().toArray();
	
	System.out.println(Arrays.toString(c));
}

}

