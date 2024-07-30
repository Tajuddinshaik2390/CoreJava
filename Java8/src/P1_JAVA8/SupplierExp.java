package P1_JAVA8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExp {
public static void main(String[] args) {
//	SupplierExp obj=new  SupplierExp();
//	System.out.println(obj.giveDate());
	
	Supplier<Date> time=()-> new Date();
	System.out.println(time.get());
}
//public Date giveDate() {
//	return new Date();
//	
//}
}
