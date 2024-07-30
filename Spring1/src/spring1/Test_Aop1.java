package spring1;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
public class Test_Aop1 {
	public static void main(String args[]) {
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory f=new XmlBeanFactory(r);
		A a=f.getBean("proxy",A.class);
		a.m();
	}

}
