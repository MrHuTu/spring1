package cn.test.bean;

import java.util.List;

import org.springframework.stereotype.Component;

public class Dog {
	
	private String name;
	
	private List trait;

	public Dog() {
		
		System.out.println("一只狗出来了。。。。。。。。。。。。。。。。。。。。。");
		
	}
	
	
	public Dog(String name,List trait) {
		
		this.name = name;
		this.trait=trait;
	}


	public void init(){
		
		System.out.println("初始化");
		
	}
	public void behavior(){
		
		System.out.println(name+"犬吠");
		
	}
	
	public void destroy(){
		
		System.out.println("销毁");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getTrait() {
		return trait;
	}

	public void setTrait(List trait) {
		this.trait = trait;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", trait=" + trait + "]";
	}
	
}
