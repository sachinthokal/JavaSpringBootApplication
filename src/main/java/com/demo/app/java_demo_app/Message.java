package com.demo.app.java_demo_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {

	@GetMapping("/msg")
	public String message() {
		return "<h1>Hey Sachin !! Your Spring Boot App is Working Fine on Docker Container</h1>";
	}
	
}
