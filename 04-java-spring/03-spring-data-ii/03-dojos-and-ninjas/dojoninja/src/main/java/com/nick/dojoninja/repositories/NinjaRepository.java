package com.nick.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nick.dojoninja.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{

	//List of All Ninjas
	List<Ninja>findAll();
	
	
}
