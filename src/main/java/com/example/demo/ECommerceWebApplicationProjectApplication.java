package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class ECommerceWebApplicationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceWebApplicationProjectApplication.class, args);
	}

}
