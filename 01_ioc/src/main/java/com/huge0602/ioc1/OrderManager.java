package com.huge0602.ioc1;

import lombok.Setter;

public class OrderManager {
	@Setter
	private CarMaker maker;
	
//	public OrderManager(){
//		@Setter
//		this.maker = new KiaMaker();
//	}
	public void order(){
		Car car = maker.Sell(new Money(8000));
		System.out.println("차량 이름 :" + car.getName());
		
	}
}
