package com.nick.HelloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {
	
	@RequestMapping("/")
	public String welcome() {
		return "index.jsp";
	}
	
	@RequestMapping("/{username}")
	public String showName(@PathVariable("username") String userName, Model viewModel) {
		viewModel.addAttribute("userName", userName);
		return "greeting.jsp";
	}
}
