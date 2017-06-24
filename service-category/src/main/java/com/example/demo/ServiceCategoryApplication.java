package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@SpringBootApplication
public class ServiceCategoryApplication {
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
