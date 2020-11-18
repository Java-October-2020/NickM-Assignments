package com.nick.productsandcategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nick.productsandcategories.models.Category;
import com.nick.productsandcategories.models.Product;
import com.nick.productsandcategories.services.CategoryService;
import com.nick.productsandcategories.services.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	private CategoryService cService;
	@Autowired
	private ProductService pService;
	
	
	@GetMapping("/products/new")
	public String newProductPage(Model model, @ModelAttribute("product") Product product) {
		return "/products/new.jsp";
	}
	@PostMapping("/products/new")
	public String newNinja(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "/products/new.jsp";
		}
		else {
			pService.createProduct(product);
			return "redirect:/products/new.jsp";
		}
	}
	
	@GetMapping("/categories/new")
	public String newCategoryPage(Model model, @ModelAttribute("category") Category category) {
		return "/categories/new.jsp";
	}
	@PostMapping("/categories/new")
	public String newNinja(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "/categories/new.jsp";
		}
		else {
			cService.createCategory(category);
			return "redirect:/categories/new";
		}
	}
	
	@GetMapping("/product/{id}")
	public String showProduct(@PathVariable("id") Long id, Model viewModel) {
		Product product = this.pService.findById(id);
		viewModel.addAttribute("product", product);
		List<Category> uniqueCats = this.cService.catsNotAdded(product);
		viewModel.addAttribute("uniqueCats", uniqueCats);
		List<Category> categories = product.getCategories();
		return "/products/show.jsp";
	}
	@GetMapping("/category/{id}")
	public String showCategory(@PathVariable("id") Long id, Model viewModel) {
		Category category = this.cService.findById(id);
		viewModel.addAttribute("category", category);
		List<Product> products = category.getProducts();
		viewModel.addAttribute("products", products);
		List<Product> unAdded = this.pService.getUniqueCats(category);
		viewModel.addAttribute("unAdded", unAdded);
		return "/categories/show.jsp";
	}
	
}
