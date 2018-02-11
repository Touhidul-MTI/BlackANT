package com.bjit.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bjit.spring.model.Category;
import com.bjit.spring.model.Product;
import com.bjit.spring.repository.CategoryRepository;
import com.bjit.spring.repository.ProductRepository;

@Controller
public class CategoryController {
	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping(value = "/allcategories")
	public String getCategories() {
		List<Category> categories = new ArrayList<>();
		categoryRepository.findAll().forEach(categories::add);

		for (Category category : categories) {
			System.out.println(category);
		}
		return "index_page";
	}
	public List<Category> getAllCategories(){
		List<Category> categories = new ArrayList<>();
		categoryRepository.findAll().forEach(categories::add);
		return categories;
	}
}
