package com.nick.dojoninja.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import com.nick.dojoninja.services.AppService;

@Controller
public class HomeController {

//	@Autowired
//	private AppService appService;
	
	@GetMapping("/")
	public String directPage() {
		return "directPage.jsp";
	}
	
}
