package com.nick.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nick.dojoninja.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{

	//List of all Dojos
	List<Dojo>findAll();
	//Find Dojo by Name
	List<Dojo>findByNameContaining(String dojoName);
}
