package com.nick.Languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nick.Languages.models.Language;
import com.nick.Languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository lRepo) {
		this.lRepo = lRepo;
	}
	
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
    public List<Language> getAllLanguages() {
        return this.lRepo.findAll();
    }
	
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	
	public Language updateLanguage(Language updatedLanguage) {
		return this.lRepo.save(updatedLanguage);
	}
	
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
}
