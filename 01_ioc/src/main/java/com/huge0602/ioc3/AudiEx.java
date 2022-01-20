package com.huge0602.ioc3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AudiEx {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ioc3.xml");
		Audi audi = ctx.getBean("audi", Audi.class);
		System.out.println(audi);
		
		String str = ctx.getBean("str", String.class);
		System.out.println(str);
		
		Car c = ctx.getBean("car1", Car.class);
		System.out.println(c);
		
		Car a = ctx.getBean("car", Car.class);
		System.out.println(a);
		
		int i = ctx.getBean("iii", Integer.class);
		System.out.println(i);
		
		Car b = ctx.getBean("car2", Car.class);
		System.out.println(b);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(audi.getCar());
		System.out.println(audi.getCar().getQwer());

	}

}
