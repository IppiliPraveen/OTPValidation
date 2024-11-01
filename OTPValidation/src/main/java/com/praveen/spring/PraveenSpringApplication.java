package com.praveen.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.praveen"})
//@EnableJpaRepositories(basePackages = "com.praveen.spring.repository")
public class PraveenSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraveenSpringApplication.class, args);
	}
}
