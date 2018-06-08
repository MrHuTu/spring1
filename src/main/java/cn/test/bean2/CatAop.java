package cn.test.bean2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CatAop {
	
	@Pointcut("execution(** cn.test.bean2.Cat.*(..))")
	public  void getUp(){
		
	}
	
	@Before(value = "getUp()")
	public void doSthing(){
		
		System.out.println("起床............");
		
	}

}
