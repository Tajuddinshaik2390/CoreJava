import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps4 {
	public static void main(String[] args) {
		// creation of a map
		Map<Integer, String> map_obj = new HashMap<>();
		// adding elements in map
		map_obj.put(1, "one");
		map_obj.put(2, "two");
		Set<Integer> keys = map_obj.keySet();
		System.out.println(keys);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for (Integer data : keys) {
			System.out.println("keys: " + data);
		}
		Collection<String> val = map_obj.values();
		for (String data : val) {
			System.out.println("values:" + data);
			

			//System.out.println(map_obj.get(1));

		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		for (Integer data1 : map_obj.keySet()) {
			System.out.println("keys" + data1 + ">>>>>>" + map_obj.get(data1));

		}

		map_obj.forEach((k, v) -> {
			// System.out.print("key: " + k + ",value: "+ v+"; ");
			// System.out.println("key: " + k + ", value: " + v);
			// System.out.println(">>>>>>>>>>>>>>>");
			System.out.println("key: " + k + ", " + "value: " + v);

		});
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		for (Map.Entry<Integer, String> entry : map_obj.entrySet()) {

			System.out.println("key: "+entry.getKey() + " ," +"value:"+ entry.getValue());
			;
		}

	}
}
