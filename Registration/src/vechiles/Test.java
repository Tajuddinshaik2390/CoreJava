package vechiles;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Resource r=new ClassPathResource("applicationContext.xml");
    BeanFactory b=new XmlBeanFactory(r);
    Customer e=(Customer) b.getBean("myCustomer");
    		e.show();
	}

}
