package com.huge0602.ioc2;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
// component : 개발자가 직접 작성한 클래스를 Bean으로 등록하기 위한 어노테이션이다.
// component 와 service 둘다 기능은 같지만 알아보기용 vo쪽에는 component (부품)
// 기능쪽에는 service
public class Car {
	private String name;
}
