package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;



/*
 * @EnableEurekaClient와 같은 의미로, 서버에 등록되기 위한 어노테이션
 * 	 Discovery : 모든 서버 타입을 다 받는 확장 개념
 */
@EnableZuulProxy	//쥴 서버의 안내자라는 선언
@EnableDiscoveryClient	
@SpringBootApplication
public class ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}

}
