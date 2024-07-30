package javapractice;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      for(int i=0;i<arr.length;i++) {
//    	  for (int j =i+1;j<arr.length-1;j++) {
//    		  if(arr[i]==arr[j]) {
//    			
//    			 
//    		  }
//    	  }
//    	  
//      }
		int arr[] = { 1, 2, 1, 3, 1, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				if (arr[i] == arr[j]) {
					arr[j] = Integer.MAX_VALUE;

				}
			}
			//System.out.println(arr[i]);
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Integer.MAX_VALUE) {
				count++;

			}

		}
		int arr1[]=new int[arr.length-count];
		for(int i=0;i<arr1.length;i++) {
			
			arr1[i]=arr[i];
			System.out.println(arr1[i]);
		}
		//System.out.println(count);
		// 
	}

}
