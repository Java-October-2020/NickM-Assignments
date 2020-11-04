package com.nick.Routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	
		@RequestMapping("")
		public String welcome() {
			return "Hello Coding Dojo";
		}
		
		@RequestMapping("/python") 
		public String finish() {
			return "Python/Django was awesome!";
		}
		
		@RequestMapping("/java")
		public String opinion() {
			return "Java/Spring is better!";
		}
}
