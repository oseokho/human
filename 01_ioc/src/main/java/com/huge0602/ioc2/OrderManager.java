package com.huge0602.ioc2;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Setter
@Service
public class OrderManager {
//	Qualifier : id 느낌 ? 동일한 타입의 두 빈 객체가 있을경우 이름 지정 hm을 사용한다는 뜻
	@Qualifier("hm")
//	@Autowired는 주입하려고 하는 객체의 타입이 일치하는 객체를 loc 컨테이너 안에 존재하는 Bean을 자동으로 주입한다. 
	@Inject
//	Autowired: bean 자동으로 주입
	private CarMaker maker;
	@Autowired
//	Autowired: bean 자동으로 주입
	private Money money;
	
	public void order(){
		Car car = maker.Sell(money);
		System.out.println("차량 이름 :" + car.getName());
		
	}
}
