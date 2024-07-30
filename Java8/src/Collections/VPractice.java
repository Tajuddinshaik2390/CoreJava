package Collections;

import java.util.Arrays;
import java.util.Vector;

public class VPractice {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(1);
		v.addElement(2);
		v.addElement("taj");
		//System.out.println(v);
		
		int aaa[]=new int[] {1,233,2};
		
		Vector<Integer>vi=new Vector(Arrays.asList(aaa));
		//System.out.println(vi.size());
		for(int a=0;a<=vi.size();a++) {
			System.out.println(a);
		}
		Object a[]=v.toArray();
		System.out.println(Arrays.toString(a));
for(int i=0;i<v.size();i++) {
	System.out.println(v.get(i));
	
}

Object arr[]=v.toArray();
//System.out.println(Arrays.toString(arr));
//int arr[]=new int[]{1,2,3};
//Vector<Integer> v1=new Vector(Arrays.asList(arr));
	}

}
