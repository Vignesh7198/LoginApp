package com.springboot.firstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.springboot.model")
public class SpringBootRegistrationAndLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRegistrationAndLoginApplication.class, args);
	}

}
