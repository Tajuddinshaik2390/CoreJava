import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Maps1 {
	public static void main(String[] args) {
		Map<Integer, String> map_obj = new Hashtable<>();
		map_obj.put(1, "taj");

		map_obj.put(2, "ammi jaan");
		map_obj.put(3, "bhaiya");
		Set<Integer> keys = map_obj.keySet();
		// System.out.println(keys);
		for (int data : keys) {
			System.out.println(data);

		}

		Collection<String> val_data=map_obj.values();
		
		for(String val:val_data)
		System.out.println(val);
		
	}
}
