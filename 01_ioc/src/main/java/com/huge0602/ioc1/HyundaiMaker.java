package com.huge0602.ioc1;

public class HyundaiMaker implements CarMaker {
	
	@Override
	public Car Sell(Money money) {
		  System.out.println("금액 :"+money.getAmount());
		  return new Car("Genesis g80");
	}

}
