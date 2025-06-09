package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // file khởi động ứng dụng Spring Boot
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); // Khởi động ứng dụng
	}
	@Bean // Cách chạy ứng dụng khi khởi động
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.registerUser();
		};
	}
}
