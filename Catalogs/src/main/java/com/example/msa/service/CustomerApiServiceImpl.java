package com.example.msa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


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
	 */
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public String getCustomerDetail(String customerId) {
		return restTemplate.getForObject("http://localhost:8082/customers/" + customerId , String.class);
	}
}
