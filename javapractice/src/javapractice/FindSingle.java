package javapractice;

public class FindSingle {
	 public static int  removeDuplicates(int Arr[],int n) {
		 int temp[]=new int[n];
		 int j=0;
		 int i;
		for( i=0;i<n-1;i++) {
			if(Arr[i]!=Arr[i+1]) {
				temp[j]=Arr[i];
				j++;
			}
		}
		temp[j++]=Arr[n-1];
		for( i=0;i<j;i++) {
			Arr[i]=temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int Arr[]= {10,10,20,21,30};
		int n=Arr.length;
		n=removeDuplicates(Arr,n);
		
		for(int i=0;i<n;i++) {
			System.out.println(Arr[i]);
		}
	}

}
