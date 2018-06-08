package cn.test.bean2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		
		Cat  cat=  (Cat)context.getBean("cat");
		
		cat.play();
		
	}

}
