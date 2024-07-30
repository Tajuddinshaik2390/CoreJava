import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Map;
import java.util.Set;

public class Maps2 {
	public static void main(String[] args) {
		// creating a map
		LinkedHashMap<Integer, String> map_obj = new LinkedHashMap<>();
		System.out.println(map_obj);
		// inserting a data into map
		map_obj.put(1, "AMMI");
		map_obj.put(2, "bhaiya");
		map_obj.put(3, "TAj");
		System.out.println(map_obj);

//		// getting keys in from map
//		Set<Integer> keys_data = map_obj.keySet();
//		System.out.println(keys_data);
//		// getting values from map
//		Collection<String> val_data = map_obj.values();
//		System.out.println(val_data);
//		// getting key value pair from maps
//		for (int all_keys : keys_data) {
//			System.out.println(all_keys + " " + map_obj.get(all_keys));
//		}
//		System.out.println(map_obj.get(1));
//		System.out.println(map_obj.containsKey(4));
//		System.out.println(map_obj.containsValue("gasgas"));
//		System.out.println(map_obj);
//
//		System.out.println(map_obj.putIfAbsent(4, "bhaiya"));
//		System.out.println(map_obj);
//		System.out.println(map_obj.putIfAbsent(5, "bhaiya"));
//		System.out.println(map_obj);
//		System.out.println(map_obj.replace(5, "sss"));
//
//		System.out.println(map_obj);
//		System.out.println(map_obj.replace(5, "sss", "new sss"));
//		System.out.println(map_obj);
//		System.out.println(map_obj.size());
//		System.out.println(map_obj.replace(5, "sss"));
//		System.out.println(map_obj);
//		System.out.println(map_obj.replace(10, "sss"));
//		System.out.println(map_obj);
//		
	//Set<Entry<Integer,String>> aa=map_obj.entrySet<>();

		for (int dataa : map_obj.keySet()) {
			System.out.println("keys:" + dataa + " " + "values: " + map_obj.get(dataa));
		}

		System.out.print("-----------------------------------\n");
		for (Map.Entry<Integer, String> daa : map_obj.entrySet()) {
			System.out.println(daa.getKey() + " " + daa.getValue());
		}
//		Set<java.util.Map.Entry<Integer, String>> da = map_obj.entrySet();
//		for (Entry<Integer, String> entry : da) {
//		
//			
//		}
		
		

	}
}
