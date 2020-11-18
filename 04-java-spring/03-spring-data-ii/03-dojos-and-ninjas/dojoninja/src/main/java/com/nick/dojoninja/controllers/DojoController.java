package com.nick.dojoninja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nick.dojoninja.models.Dojo;
import com.nick.dojoninja.services.AppService;

@Controller
public class DojoController {

	@Autowired
	private AppService appService;
	
	@GetMapping("/dojos/new")
	public String createDojoPage(@ModelAttribute("dojo") Dojo dojo, Model model) {
		return "newDojo.jsp";
	}
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		}
		else {
			appService.createDojo(dojo);
			return "redirect:/";
		}
	}
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
			Dojo dojo = appService.getOneDojo(id);
			model.addAttribute("dojo", dojo);
			return "DojoAndNinjas.jsp";
	}
	@GetMapping("/dojos")
	public String allDojos(Model model, @ModelAttribute("dojo") Dojo dojo) {
		List<Dojo> dojos = appService.getAllDojos();
		model.addAttribute("dojos", dojos);
		return "redirect:/dojos/new";
	}
	
}
