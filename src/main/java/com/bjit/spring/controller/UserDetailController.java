package com.bjit.spring.controller;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjit.spring.model.Country;
import com.bjit.spring.model.UserDetail;
import com.bjit.spring.model.UserDetailJsonResponse;
import com.bjit.spring.repository.UserDetailRepository;

@Controller
public class UserDetailController {
	@Autowired
	private UserDetailRepository userDetailRepository;

	@Autowired
	private CountryController countryController;

	@GetMapping(value = "/alluserdetails")
	public String getAllUsers(Model model) {
		List<UserDetail> userDetails = new ArrayList<>();
		userDetailRepository.findAll().forEach(userDetails::add);
		model.addAttribute("userDetails", userDetails);

		List<Country> countries = countryController.getAllCountries();
		model.addAttribute("countries", countries);

		return "userManager_AJAX_page";
	}

	@PostMapping(value = "/saveuser", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public UserDetailJsonResponse saveEmployee(@ModelAttribute @Valid UserDetail userDetail, BindingResult result) {
		UserDetailJsonResponse respone = new UserDetailJsonResponse();
		if (result.hasErrors()) {
			// Get error message
			Map<String, String> errors = result.getFieldErrors().stream()
					.collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
			respone.setValidated(false);
			respone.setErrorMessages(errors);
		} else {
			respone.setValidated(true);
			respone.setUserDetail(userDetail);
		}
		return respone;
	}
}
