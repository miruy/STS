package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/*
 * @CongifServer의 역할을 하는 선언, 정의 해놓은 설정파일을 가지고 클라이언트에게 제공
 */
@SpringBootApplication
@EnableConfigServer	
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
