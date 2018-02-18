package com.bjit.spring.ajaxtest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bjit.spring.model.Product;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping(value = "/manageemployees")
	public String manageEmployees() {
		return "employeeManager_page";
	}

	// using post to data trans and pagination
	@PostMapping(value = "/employeepagination", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public EmployeeJsonResponse emp(Pageable pageable) {
		EmployeeJsonResponse employeeJsonResponse = new EmployeeJsonResponse();
		Page<Employee> pages = employeeRepository.findAll(pageable);

		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);

		employeeJsonResponse.setEmployeeList(employees);
		employeeJsonResponse.setPages(pages);

		return employeeJsonResponse;
	}

	// // public String getPages(Model model, @PageableDefault(size = 2)Pageable
	// // pageable) {
	// @GetMapping(value = "/pageTest")
	// public String getPages(Model model, Pageable pageable) {
	//
	// Page<Employee> pages = employeeRepository.findAll(pageable);
	//
	// System.out.println(pages.getSize());
	//
	// model.addAttribute("number", pages.getNumber());
	// model.addAttribute("totalPages", pages.getTotalPages());
	// model.addAttribute("totalElements", pages.getTotalElements());
	// model.addAttribute("size", pages.getSize());
	// model.addAttribute("employees", pages.getContent());
	//
	// model.addAttribute("pages", pages);
	//
	// return "pagetest_page";
	// }

	@GetMapping("/addemployee")
	public String employeeForm() {
		return "employeeForm_page";
	}

	@PostMapping(value = "/saveEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public EmployeeJsonResponse saveEmployee(@ModelAttribute @Valid Employee employee, BindingResult result) {

		EmployeeJsonResponse respone = new EmployeeJsonResponse();
		if (result.hasErrors()) {
			// Get error message
			Map<String, String> errors = result.getFieldErrors().stream()
					.collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
			respone.setValidated(false);
			respone.setErrorMessages(errors);
		} else {
			employeeRepository.save(employee);

			respone.setValidated(true);
			respone.setEmployee(employee);
		}
		return respone;
	}

	@DeleteMapping(value = "/deleteemployee/{employeeId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public EmployeeJsonResponse deleteEmployee(@PathVariable int employeeId) {

		Employee employee = employeeRepository.findOne(employeeId);

		if (employee != null) {
			employeeRepository.delete(employee);
			System.out.println("emplyee has been deleted");
		} else {
			System.out.println("emploee id not found to delete!");
		}

		EmployeeJsonResponse respone = new EmployeeJsonResponse();
		respone.setEmployee(employee);

		return respone;
	}

	@GetMapping(value = "/updateemployee/{employeeId}")
	public String updateEmployee(@PathVariable int employeeId, Model model) {

		Employee employee = employeeRepository.findOne(employeeId);
		model.addAttribute("employee", employee);

		return "employeeUpdater";
	}

	@PostMapping(value = "/employeeupdater")
	public String employeeUpdater(@ModelAttribute Employee employee) {

		employeeRepository.save(employee);
		return "redirect:/manageemployees";
	}
	
	// @PostMapping(value = "/employeeupdater", produces = {
	// MediaType.APPLICATION_JSON_VALUE })
	// @ResponseBody
	// public EmployeeJsonResponse employeeUpdater(@ModelAttribute @Valid Employee
	// employee, BindingResult result) {
	//
	// EmployeeJsonResponse respone = new EmployeeJsonResponse();
	// if (result.hasErrors()) {
	// // Get error message
	// Map<String, String> errors = result.getFieldErrors().stream()
	// .collect(Collectors.toMap(FieldError::getField,
	// FieldError::getDefaultMessage));
	// respone.setValidated(false);
	// respone.setErrorMessages(errors);
	// } else {
	// employeeRepository.save(employee);
	//
	// respone.setValidated(true);
	// respone.setEmployee(employee);
	// }
	// return respone;
	// }

}
