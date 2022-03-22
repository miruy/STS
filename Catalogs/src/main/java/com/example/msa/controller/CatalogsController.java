package com.example.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msa.service.CustomerApiService;

@RestController	//controller클래스라는 선언
@RequestMapping("/catalogs/customerinfo")	//해당 url로 요청시 해당 컨트롤러 클래스 실행
public class CatalogsController {
	
	
	
	/*
	 * customerApiServic 객체가 필요한 의존 객체의 '타입'에 맞는 bean 자동 주입 
	 *   기존의 스프링에서 controller.xml에 설정했던 <bean>태그를 이제 설정하지 않기때문에 어노테이션으로 꼭 설정해야함
	 */
	@Autowired	
	private CustomerApiService customerApiService;
	
	@GetMapping(path="/{customerId}")	//url로 해당 요청이 들어오면 해당 메서드 실행
	public String getCustomerInfo(@PathVariable String customerId) {	//변할 수있는 경로 어노테이션(사용자 아이디를 불러오기 때문에)
		String customerInfo = customerApiService.getCustomerDetail(customerId);
		System.out.println("response customerInfo : " + customerInfo);
		return String.format("[Customer id=%s at %s %s]",
				customerId, System.currentTimeMillis(), customerInfo);
	}
}







