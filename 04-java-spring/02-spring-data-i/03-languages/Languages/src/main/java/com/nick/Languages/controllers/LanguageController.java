package com.nick.Languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nick.Languages.models.Language;
import com.nick.Languages.services.LanguageService;

@Controller
public class LanguageController {

	private LanguageService lService;
	
	public LanguageController(LanguageService lService) {
		this.lService = lService;
	}
	
	@GetMapping("/languages")
	public String index(Model model, @ModelAttribute("language") Language language) {
		List<Language> languages = lService.getAllLanguages();
		model.addAttribute("allLanguages", languages);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String createLangHome(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		else {
			lService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	@GetMapping("/language/{id}")
	public String showLanguage(Model model, @PathVariable("id") Long id) {
		Language language = lService.getOneLanguage(id);
		model.addAttribute("language", language);
		return "showLanguage.jsp";
	}
	
    @GetMapping("/language/edit/{id}")
    public String editLanguage(@PathVariable("id") Long id, Model model) {
        Language language = lService.getOneLanguage(id);
        if (language != null){
            model.addAttribute("language", language);
            return "editLanguage.jsp";
        }else{
            return "redirect:/languages";
        }
    }
    @PostMapping("/language/edit/{id}")
    public String updateLanguage(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language updatedLanguage, BindingResult result) {
        if (result.hasErrors()) {
            return "editLanguage.jsp";
        }else{
            this.lService.updateLanguage(updatedLanguage);
            return "redirect:/languages";
        }
    }
	
    @GetMapping("language/delete/{id}")
    public String deleteLanguage(@PathVariable("id") Long id) {
    	this.lService.deleteLanguage(id);
    	return "redirect:/languages";
    }

}
