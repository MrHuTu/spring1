package cn.test.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public Dog dog;
		
		public Main() {
			
			System.out.println("一个Main.....出来了");
		
		}
		
		
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
	
		Bank   bank =  (Bank)context.getBean("bank");
		 
		bank.transfer();
		
		
		

	}

}
