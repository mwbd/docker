package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldApplication {

	@Value("${TARGET:World}")
	String target;
	@Value("${NAME:Mariusz}")
	String name;
	@Value("${LAST:Wieczorek}")
	String last;

	@RestController
	class HelloworldController {
		@GetMapping("/")
		String hello() {
			return "Hello " + target + " from " + name + " " + last;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
}
