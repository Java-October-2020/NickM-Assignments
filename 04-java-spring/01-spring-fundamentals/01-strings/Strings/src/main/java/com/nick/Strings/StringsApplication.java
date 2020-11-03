package com.nick.Strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
		
	}
	@RequestMapping("/")
	public String intial() {
		return "hello world!";
	}
	
	@RequestMapping("/random")
	public String hello() {
		return "something nice for the people";
	}
}
