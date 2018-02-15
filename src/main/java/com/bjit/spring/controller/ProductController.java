package com.bjit.spring.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bjit.spring.model.Category;
import com.bjit.spring.model.Product;
import com.bjit.spring.repository.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryController categoryController;

	// String filePath =
	// "E:\\BJIT_work\\J2EE\\BlackANT\\src\\main\\resources\\static\\product-images";
	String filePath = "/home/hp/eclipse-workspace/BlackANT/src/main/resources/static/product-images/";

	@GetMapping(value = "allproducts")
	public String getAllProducts(Model model) {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		model.addAttribute("products", products);
		
		List<Category> categories = categoryController.getAllCategories();
		model.addAttribute("categories", categories);

		return "test";
	}

	@GetMapping(value = "/manageproducts")
	public String manageProducts(Model model) {

		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		model.addAttribute("products", products);

		return "productManager_page";
	}

	@GetMapping(value = "/addproduct")
	public String addProduct(Model model) {

		List<Category> categories = categoryController.getAllCategories();
		model.addAttribute("categories", categories);

		return "productAdder_page";
	}

	@PostMapping(value = "/productadder")
	public String productAdder(@ModelAttribute("product") Product product, @RequestParam("file") MultipartFile file,
			Model model) {

		String fileName = createCustomFileName(file.getOriginalFilename());

		// String filePath =
		// "E:\\BJIT_work\\J2EE\\BlackANT\\src\\main\\resources\\static\\product-images";
		// String filePath =
		// "/home/hp/eclipse-workspace/BlackANT/src/main/resources/static";

		File path = new File(filePath);

		if (!path.exists()) {
			path.mkdirs();
		}
		
		try {
			Files.copy(file.getInputStream(), Paths.get(filePath, fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

		product.setProductImage(fileName);
		productRepository.save(product);

		return "redirect:/manageproducts";
	}

	@GetMapping(value = "/updateproduct/{productId}")
	public ModelAndView updateProduct(@PathVariable int productId, ModelMap model) {

		List<Category> categories = categoryController.getAllCategories();
		Product product = productRepository.getOne(productId);

		model.addAttribute("categories", categories);
		model.addAttribute("productObj", product);
		System.out.println(product);

		return new ModelAndView("productUpdater_page", model);
	}

	@PostMapping(value = "/productupdater")
	public String productUpdater(@ModelAttribute("product") Product product, @RequestParam("file") MultipartFile file,
			Model model) {

		// stuff to delete the existing product image
		String existingImageFileName = productRepository.findOne(product.getId()).getProductImage();

		// File fileToDelete = new
		// File("E:\\BJIT_work\\J2EE\\BlackANT\\src\\main\\resources\\static\\product-images\\"
		// + existingImageFileName);
		File fileToDelete = new File(filePath + existingImageFileName);

		if (fileToDelete.exists()) {
			if (fileToDelete.delete()) {
				System.out.println("Image deleted successfully");
			} else {
				System.out.println("Fail to delete image");
			}
		}

		// update the product
		System.out.println(file.getOriginalFilename());
		if (file.isEmpty()) {
			System.out.println("file cant read");
		}
		String fileName = createCustomFileName(file.getOriginalFilename());

		// String filePath =
		// "E:\\BJIT_work\\J2EE\\BlackANT\\src\\main\\resources\\static\\product-images";
		File path = new File(filePath);

		if (!path.exists()) {
			path.mkdirs();
		}

		try {
			Files.copy(file.getInputStream(), Paths.get(filePath, fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

		product.setProductImage(fileName);
		productRepository.save(product);

		return "redirect:/manageproducts";
	}

	@GetMapping(value = "/deleteproduct/{productId}")
	public String deleteProduct(@PathVariable int productId) {

		// stuff to delete the product image
		Product product = productRepository.findOne(productId);

		// File fileToDelete = new
		// File("E:\\BJIT_work\\J2EE\\BlackANT\\src\\main\\resources\\static\\product-images\\"
		// + product.getProductImage());
		File fileToDelete = new File(filePath + product.getProductImage());

		if (fileToDelete.exists()) {
			if (fileToDelete.delete()) {
				System.out.println("Image deleted successfully");
			} else {
				System.out.println("Fail to delete image");
			}
		}

		// delete product
		productRepository.delete(productId);

		return "redirect:/manageproducts";
	}

	public String createCustomFileName(String fileName_old) {
		Random rand = new Random();
		int randNum = rand.nextInt(10000) + 1;

		String[] fileName_array = fileName_old.split("\\.");
		String fileName_postFix = fileName_array[fileName_array.length - 1];
		String fileName_new = "blackant" + randNum + "." + fileName_postFix;

		return fileName_new;
	}
}
// List<Product> products = new ArrayList<>();
// productRepository.findAll().forEach(products::add);
// model.addAttribute("products", products);
// return new ModelAndView("redirect:/manageproducts", model);