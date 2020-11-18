package com.nick.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nick.productsandcategories.models.Category;
import com.nick.productsandcategories.models.Product;
import com.nick.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository cRepo;
	
	// Get All
	public List<Category> getAllCategories() {
		return this.cRepo.findAll();
	}
	public Category findById(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	
	//create
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	public Category updateCategory(Category category) {
		return this.cRepo.save(category);
	}
	public List<Category> catsNotAdded(Product product) {
		return this.cRepo.findByProductsNotContains(product);
	}
}
