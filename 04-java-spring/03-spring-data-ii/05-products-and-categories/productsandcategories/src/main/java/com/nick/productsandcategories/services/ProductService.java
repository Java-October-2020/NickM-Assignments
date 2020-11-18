package com.nick.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nick.productsandcategories.models.Category;
import com.nick.productsandcategories.models.Product;
import com.nick.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository pRepo;
	
	// Get All
	public List<Product> getAllProducts() {
		return this.pRepo.findAll();
	}
	
	public Product findById(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	//create
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public Product updateProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public List<Product> getUniqueCats(Category category) {
		return this.pRepo.findByCategoriesNotContains(category);
	}
}
