package com.bjit.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bjit.spring.model.Admin;
import com.bjit.spring.model.Product;
import com.bjit.spring.repository.ProductRepository;
import com.bjit.spring.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping(value = "/myadmin")
	public String adminLogin(ModelMap model) {
		return "adminLoginForm_page";
	}
	
//	@GetMapping(value = "/admintest")
//	public String admintest(Model model) {
//		Admin a = new Admin();
//		a.setName("admintester");
//		a.setEmail("adin@gmail.com");
//		
//		model.addAttribute("admin", a);
//		return "adminPanel_page";
//	}
	
	@PostMapping(value = "/adminVarify")
	public String adminLoginVarification(@ModelAttribute("adminModel") Admin admin, ModelMap model) {

		List<Admin> admins = adminService.getAllAdmins();
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		model.addAttribute("products", products);
		
		for (Admin adminObj : admins) {
			if (adminObj.getEmail().equals(admin.getEmail()) && adminObj.getPassword().equals(admin.getPassword())) {

				model.addAttribute("admin", adminObj);
				return "adminPanel_page";
			}
		}
		return "adminLoginForm_page";
	}

	@GetMapping(value = "/logout")
	public String adminLogout() {
		return "adminLoginForm_page";
	}

	// @RequestMapping("/universities")
	// public List<University> getAllUniversities() {
	// return universityService.getAllUniversities();
	// }
	// @RequestMapping(method = RequestMethod.GET,
	// value="/universities/{universityId}")
	// public University getUniversity(@PathVariable String universityId) {
	// return universityService.getUniversity(universityId);
	// }
	//
	// @RequestMapping(method=RequestMethod.POST, value="/universities")
	// public void addUniversity(@RequestBody University university) {
	// universityService.addUniversity(university);
	// }
	//
	// @RequestMapping(method=RequestMethod.PUT,
	// value="/universities/{universityId}")
	// public void updateUniversity(@RequestBody University university,
	// @PathVariable String universityId) {
	// universityService.updateUniversity(university);
	// }
	//
	// @RequestMapping(method=RequestMethod.DELETE,
	// value="/universities/{universityId}")
	// public void deleteUniversity(@PathVariable String universityId) {
	// universityService.deleteUniversity(universityId);
	// }
}