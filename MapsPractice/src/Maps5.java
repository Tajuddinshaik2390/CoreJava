import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps5 {
public static void main(String[] args) {
Map<Integer,String> map =new HashMap<Integer, String>();
map.put(1, null);
map.put(2, null);

	map.forEach((k,v)->{
		System.out.print("keys:"+k+","+"value:"+v);
		
	});


}
}
