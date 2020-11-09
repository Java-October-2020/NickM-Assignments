package com.nick.DojoSurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String infoForm() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/result", method=RequestMethod.POST)
	public String results(@RequestParam(value="name") String name, @RequestParam(value="dojoLocation") String location, @RequestParam(value="favoriteLanguage") String language, @RequestParam(value="Comment", required=false) String comment, Model viewModel) {
		viewModel.addAttribute("submittedName", name);
		viewModel.addAttribute("submittedLanguage", language);
		viewModel.addAttribute("submittedLocation", location);
		viewModel.addAttribute("Comment", comment);
		
		return "result.jsp";
	}
}
