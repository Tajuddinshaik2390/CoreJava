import java.security.KeyStore.Entry;
import java.util.Hashtable;
import java.util.Map;

public class Maps3 {
public static void main(String[] args) {
	Map<String,Integer> mapp=new Hashtable<>();
mapp.put("one",1);
mapp.put("two",2);
mapp.put("three",3);
for(String keys:mapp.keySet()) {
	System.out.println("key "+keys+" value "+mapp.get(keys));
	
	
	
}

System.out.println("------------------------------------------------------");




//for(Map.Entry<String,Integer> dattt:mapp.entrySet()) {
//	System.out.println(dattt.getKey()+" "+dattt.getValue());
//	
//}
Map<String,Integer> map2=new Hashtable<String,Integer>(mapp);
map2.put("four", 4);
map2.put("five", 5);


for(Map.Entry<String,Integer> data:map2.entrySet()) {
	System.out.println(data.getKey()+ " "+ data.getValue());
}
}


}
