package com.example.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


/*
 * @ComponentScan : 정의하는 경로의 모든 클래스를 스캔하여 자동으로 bean 등록  
 * @SpringBootApplication : main 메소드가 선언된 클래스를 기준으로 실행되며
 * 	스프링 부트의 기본적인 설정을 해주는 어노테이션(='이거 스프링부트 사용한다')
 * 
 * @EnableCircuitBreaker : 서킷의 개념 이해하기, 전화를 걸때 사용하는 중간중간의 기지국 장비들간의 이어지는 연결 처럼,
 * 	요청과 응답 간에 중간 연결을 캐치하는 어노테이션 
 */
@ComponentScan("com.example.msa")
@EnableCircuitBreaker
@EnableEurekaClient		//(enable : 실행되면)유레카 클라이어트라는 선언
@SpringBootApplication
public class CatalogsApplication {
	
	@Bean //생성자 자동 주입 및 bean 자동 새성
	@LoadBalanced	//RestTemplate에 리본 적용, 리본적용된 객체가 생성될 때 부화분리(LoadBalanced)되게 생성됨
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	/*
	 * SpringApplication.run(CatalogsApplication.class, args)
	 * 	: 클래스 위의 선언된 @SpringBootApplication의 동작 방식
	 * 	- SpringApplication은 @SpringBootApplication어노테이션에 속함
	 * 	- Java 기본 메소드에서 Spring 애플리케이션을 부트스트랩하고 실행하는 데 사용할 수 있는 클래스로,
	 * 		기본적으로 클래스는 애플리케이션을 부트스트랩하기 위해 다음 단계를 수행 
	 */
	public static void main(String[] args) {
		SpringApplication.run(CatalogsApplication.class, args);
	}

}
