package com.app.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/")
	public String getWelcome() {
		return "Welcome To Product Service";
	}

	@GetMapping("/products")
	public String getAllProducts() {
		return "List of all products";
	}

}
