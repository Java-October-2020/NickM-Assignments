package com.nick.dojoninja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nick.dojoninja.models.Dojo;
import com.nick.dojoninja.models.Ninja;
import com.nick.dojoninja.services.AppService;

@Controller
public class NinjaController {

	@Autowired
	private AppService appService;
	
	@GetMapping("/ninjas/new")
	public String newNinjaPage(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = appService.getAllDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}
	@PostMapping("/ninjas/new")
	public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "newNinja.jsp";
		}
		else {
			appService.createNinja(ninja);
			return "redirect:/";
		}
	}
	@GetMapping("/showNinjas")
	public String showAllNinjas(Model model, @ModelAttribute("ninja") Ninja ninja) {
		List<Ninja> ninjas = appService.getAllNinjas();
		model.addAttribute("ninjas", ninjas);
		return "DojoAndNinjas.jsp";
	}
}
