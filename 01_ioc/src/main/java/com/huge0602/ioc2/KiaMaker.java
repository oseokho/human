package com.huge0602.ioc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
public class KiaMaker implements CarMaker {
	@Setter
	@Autowired
	// Autowired: bean 자동으로 주입
	private Car car;
	
	@Override
	public Car Sell(Money money) {
		  System.out.println("금액 :"+money.getAmount());
//		  return new Car("k5");
		  return car;
	}

}
