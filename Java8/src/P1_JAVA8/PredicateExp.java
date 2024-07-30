package P1_JAVA8;

import java.util.function.Predicate;

public class PredicateExp {
public static void main(String[] args) {
	PredicateExp objj=new PredicateExp();
	//System.out.println(obj.testSize("tajuddin"));
	
	Predicate<String> obj=(name)-> name.length()>=5;
	boolean reslt=obj.test("tajudin");
	System.out.println(reslt);

}




//public boolean testSize(String name) {
//	if(name.length()>=5) {
//		return true;
//	}else {
//		return false;
//	}
	
}

