package INterviewCorePrepartion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Stringdata {
public static void main(String[] args) {
	String[] data={"taj","shaik","taj"};
	
	Set<String> finaldata=duplivatres(data);
	System.out.println(finaldata);
}

public static Set<String> duplivatres(String data[]){
	Set<String> dupli=new HashSet<String>();
	return Arrays.stream(data).filter(a->!dupli.add(a)).collect(Collectors.toSet());
}
}
