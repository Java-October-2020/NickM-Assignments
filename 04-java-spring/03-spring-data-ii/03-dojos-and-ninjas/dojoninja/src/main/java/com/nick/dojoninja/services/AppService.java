package com.nick.dojoninja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nick.dojoninja.models.Dojo;
import com.nick.dojoninja.models.Ninja;
import com.nick.dojoninja.repositories.DojoRepository;
import com.nick.dojoninja.repositories.NinjaRepository;

@Service
public class AppService {

	@Autowired
	private NinjaRepository ninjaRepo;
	@Autowired
	private DojoRepository dojoRepo;
	
	public Dojo getOneDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
	
	public List<Ninja> getAllNinjas() {
		return this.ninjaRepo.findAll();
	}
	public List<Dojo> getAllDojos() {
		return this.dojoRepo.findAll();
	}
	
	public Dojo createDojo(Dojo newDojo) {
		return this.dojoRepo.save(newDojo);
	}
	public Ninja createNinja(Ninja newNinja) {
		return this.ninjaRepo.save(newNinja);
	}
	
}
