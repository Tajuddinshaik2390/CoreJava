package INterviewCorePrepartion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MinaandMax {
	public static void main(String[] args) {
		int arr[] = {  2, 3, 4,1 ,4,6,4};
//		int[] sortedarrsy=Arrays.stream(arr).sorted().skip(arr.length-2).limit(1).toArray();
//	System.out.println(Arrays.toString(sortedarrsy));
//		
		Arrays.stream(arr).sorted().distinct().forEach(a->System.out.println(a));
		
//		List<int[]> list=Arrays.asList(arr);
//		Stream<int[]> data=list.stream().sorted();
//		System.out.println(data);
//		
		
//		int min = arr[0];
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//			max=arr[i];
//			} else {
//				min=arr[i];
//			}
//			
//		}
//		System.out.println(min+" "+max);
		
		

	}

}
