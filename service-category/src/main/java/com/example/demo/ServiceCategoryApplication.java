package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RefreshScope
@RestController
@SpringBootApplication
public class ServiceCategoryApplication {
	@Value("${config.welcome: no message}")
	private String welcome;

	@GetMapping("/welcome")
	String welcome() {
		return this.welcome;
	}

	@GetMapping("/categories")
	List<Category> categories() {
		return Arrays.asList(
				new Category(1, "Books"),
				new Category(2, "T-Shirt"),
				new Category(3, "Food")
		);
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceCategoryApplication.class, args);
	}
}
