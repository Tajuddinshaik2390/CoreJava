package Collections;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractice {
	public static void main(String[] args) {
		Map<Integer, String> m = new Hashtable<>();
		m.put(123, "vij");
		m.put(234, "gun");
		m.put(344, "hyd");
		m.put(345, "viz");
		System.out.println(m);

		Collection<String> data = m.values();
		System.out.println(data);
		Set<Integer> keys = m.keySet();
		System.out.println(keys);
		for (Integer key : keys) {
			System.out.println(key);

		}

		for (String dataa : data) {
			System.out.println(dataa);
		}

		for (Integer alldata : keys) {
			System.out.println(alldata + " " + m.get(alldata));
		}
		Set<java.util.Map.Entry<Integer, String>> a = m.entrySet();
		
for (Map.Entry<Integer, String> entries : a) {
	Integer k=entries.getKey();
	String v=entries.getValue();
	System.out.println(k+""+v);
	
}
System.out.println(a);
	}

}
