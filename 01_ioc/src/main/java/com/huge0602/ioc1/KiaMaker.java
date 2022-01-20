package com.huge0602.ioc1;

public class KiaMaker implements CarMaker {

	@Override
	public Car Sell(Money money) {
		  System.out.println("금액 :"+money.getAmount());
		  return new Car("k5");
	}

}
