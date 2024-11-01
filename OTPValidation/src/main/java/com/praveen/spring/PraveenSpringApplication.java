package com.praveen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.praveen.spring.service.EmailSenderService;

@SpringBootApplication
public class PraveenSpringApplication {

	@Autowired
	EmailSenderService emailSenderService;
	
	public static void main(String[] args) {
		SpringApplication.run(PraveenSpringApplication.class, args);
	}
}
