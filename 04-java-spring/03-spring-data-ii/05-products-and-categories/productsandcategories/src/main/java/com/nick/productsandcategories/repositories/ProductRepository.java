package com.nick.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nick.productsandcategories.models.Category;
import com.nick.productsandcategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
	List<Product> findAll();
	
	List<Product> findByCategoriesNotContains(Category category);
}
