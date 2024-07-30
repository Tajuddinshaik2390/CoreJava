package spring1;
import java.lang.reflect.*;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor1 implements MethodBeforeAdvice {



@Override
public void before(Method method, Object[] args, Object target) throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("My Name");
}
}
