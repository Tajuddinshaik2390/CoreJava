package spr1;
import java.util.List;

import org.springframework.context.*;
import org.springframework.context.support.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ct=new ClassPathXmlApplicationContext("applicationcontext.xml");
EmpDao ed=(EmpDao) ct.getBean("edao");
//int result=ed.saveEmp(new Emp("salman","rrr","200"));
//System.out.print(result);
	List<Emp> list =ed.showAll();
	for( Emp e:list) {
		System.out.println(e);
	}
	}

}
