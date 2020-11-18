package com.nick.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nick.relationships.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	
	public List<License> findAll();
	public License findTopByOrderByNumberDesc();
	
}
