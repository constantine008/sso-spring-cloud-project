package com.javashitang.sso.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.javashitang.sso.server.dao")
public class SsoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoServerApplication.class, args);
	}

}