package com.praveen.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication(scanBasePackages = {"com.praveen"})
//@EnableJpaRepositories(basePackages = "com.praveen.spring.repository")
@OpenAPIDefinition(info = @Info(title = "OTP API", version = "1.0", description = "OTP Verification API"))
public class PraveenSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraveenSpringApplication.class, args);
	}
}
