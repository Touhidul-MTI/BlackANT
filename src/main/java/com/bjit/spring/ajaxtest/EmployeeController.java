package com.bjit.spring.ajaxtest;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/manageemployees")
	public String manageEmployees(Model model) {
		
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		model.addAttribute("employees", employees);
		
		return "employeeManager_page";
	}
	
	
	@GetMapping("/addemployee")
	public String employeeForm() {
		return "employeeForm";
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
			respone.setValidated(true);
			respone.setEmployee(employee);
		}
		return respone;
	}
	
	@GetMapping(value = "/deleteemployee/{employeeId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public EmployeeJsonResponse deleteEmployee(@PathVariable int employeeId, BindingResult result) {
		
		Employee employee = employeeRepository.findOne(employeeId);
		if(employee!=null) {
			employeeRepository.delete(employee);
			System.out.println("emplyee has been deleted");
		}else {
			System.out.println("emploee id not found to delete!");
		}
		
		EmployeeJsonResponse respone = new EmployeeJsonResponse();
		respone.setEmployee(employee);
		
		
		respone.setEmployee(employee);
		return respone;
	}
	@ResponseBody
	@GetMapping(value = "/employees", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Employee> employees() {
		
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		return employees;
	}
	
	@GetMapping(value = "/employees2")
	public  String manageEmployees2() {
		return "employeeManager_page2";
	}
//	@GetMapping("/emp")
//	public String emp() {
//		return "emp";
//	}
}
