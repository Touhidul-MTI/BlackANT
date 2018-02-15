package com.bjit.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bjit.spring.model.Category;
import com.bjit.spring.model.Country;
import com.bjit.spring.repository.CountryRepository;

@Controller
public class CountryController {
	@Autowired
	private CountryRepository countryRepository;

	//@GetMapping(value = "/allcountries")
	public List<Country> getAllCountries() {
		List<Country> countries = new ArrayList<>();
		countryRepository.findAll().forEach(countries::add);

		for (Country country : countries) {
			System.out.println(country);
		}
		
		return countries;
	}
}
