package com.nick.TheCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String login() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String codeCheck(@RequestParam(value="code") String code, @ModelAttribute("error") String error, RedirectAttributes redirectAttributes) {
		System.out.println(code);
		if (code.equals("bushido")) {
			return "redirect:/thecode";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/thecode")
	public String success() {	
		return "thecode.jsp";
	}
}
