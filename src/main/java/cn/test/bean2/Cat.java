package cn.test.bean2;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat {
	public Cat() {
		System.out.println("猫......................诞生了");
	}
	
	public void play(){
		
		System.out.println("玩耍.......................");
		
	}

}
