package com.nick.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nick.relationships.models.License;
import com.nick.relationships.models.Person;
import com.nick.relationships.repositories.LicenseRepository;
import com.nick.relationships.repositories.PersonRepository;

@Service
public class DMVService {

	private PersonRepository personRepo;
	private LicenseRepository licRepo;
	public DMVService(PersonRepository pRepo, LicenseRepository licRepo) {
		this.personRepo = pRepo;
		this.licRepo = licRepo;
	}
	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	public List<Person> getPeople() {
		return personRepo.findAll();
	}
	public List<Person> getUnlicensedPeople() {
		return personRepo.findByLicenseIdIsNull();
	}
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return licRepo.save(l);
	}
	public int generateLicenseNumber() {
		License l = licRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
}
