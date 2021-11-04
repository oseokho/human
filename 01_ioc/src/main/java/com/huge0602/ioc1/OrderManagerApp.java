package com.huge0602.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderManagerApp {
	public static void main(String[] args) {
//		OrderManager orderManager = new OrderManager();
//		orderManager.order();
		//DL
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc1.xml");
		OrderManager orderManager = ctx.getBean("orderManager", OrderManager.class);
//		OrderManager orderManager1 = ctx.getBean("orderManager", OrderManager.class);
//		OrderManager orderManager2 = ctx.getBean("orderManager", OrderManager.class);
//		OrderManager orderManager3 = ctx.getBean("orderManager", OrderManager.class);
//		OrderManager orderManager = (OrderManager)ctx.getBean("orderManager");
		orderManager.order();
		
		// 프로토타입 : vo쪽에서 객체를 매번 새로 생성하기 때문에 주소가 각각 다름
		
		// 싱글턴이라 주소가 다 같음 (기본값) xml에서 scope를 통해 바꿀 수 있음
		// 싱글턴 : vo쪽 생성자를 private로 하여 외부에서 접근불가능하고
		// vo쪽에서 객체를 생성한것을 쓰기 때문에 주소가 같음
//		System.out.println(orderManager);
//		System.out.println(orderManager1);
//		System.out.println(orderManager2);
//		System.out.println(orderManager3);
	}
}
