package vechiles;
import java.util.List;

import org.springframework.context.*;
import org.springframework.context.support.*;


public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ct=new ClassPathXmlApplicationContext("applicationContext.xml");
CustomerDao ed=(CustomerDao) ct.getBean("edao");
int result=ed.saveCustomer(new Customer("1","rrr","200","567","6789"));
System.out.print(result);
	List<Customer> list =ed.showAll();
	for( Customer e:list) {
		System.out.println(e);
	}
	}
}
