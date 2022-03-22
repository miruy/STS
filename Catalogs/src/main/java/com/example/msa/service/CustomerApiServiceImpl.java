package com.example.msa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


/*
 * @Service : 해당 클래스를 서비스라고 선언 및 서비스 객체(bean)자동 생성
 * 	- @Reporitory, @RestController, @Controller 도 모두 선언 및 객체 자동 생성을 의미
 */
@Service	
public class CustomerApiServiceImpl implements CustomerApiService{
	
	/*
	 * 기존 
	 * 	- Jsp의 jdbcTemplate-오라클 드라이버와 연동, 
	 * 	- 스프링의 sqlSessionTemplate-쿼리문 사용 및 DB연동
	 * 	을 위해 사용한 개념과 같이
	 * 	- HTTP서버와 연동을 해야하기 때문에 RestTemplate사용
	 * 
	 * RestTemplate : REST API 호출 이후 응답을 받을 때까지 기다리는 동기 방식
	 * 자동주입
	 * 
	 * Ribbon 적용
	 * RestTemplate가 직접 Customers서비스(서버)에게 직접 요청해야하므로 직접 경로 요청 안됨
	 * 	- localhost:8082 대신 customer로 작성 후 application.yml파일에서 서버리스트 작성
	 * 	- 실제 브라우저 url 경로 :  http://localhost:8082/customers/123
	 */
	@Autowired
	private RestTemplate restTemplate;	//리본 적용해줘야함
	
	//히스트릭스의 기능 적용할 메서드
	@Override
	@HystrixCommand(fallbackMethod="getCustomerDetailFallback")
	public String getCustomerDetail(String customerId) {
		return restTemplate.getForObject("http://customer/customers/" + customerId , String.class);
	}
	
	//위의 메서드가 제대로 실행되지 않을 경우 실행할 메서드 (변명의 개념=Fallback) 
	public String getCustomerDetailFallback(String customerId, Throwable ex) {
		System.out.println("Error : " + ex.getMessage());
		return "고객 정보 조회가 지연되고 있습니다.";
	}
}
