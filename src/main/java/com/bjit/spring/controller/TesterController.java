package com.bjit.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.bjit.spring.model.Admin;
import com.bjit.spring.model.Tester;
import com.bjit.spring.repository.TesterRepository;
import com.bjit.spring.service.AdminService;

@Controller
public class TesterController {
	@Autowired
	private TesterRepository testerRepository;

	@GetMapping(value = "/tester")
	public String testy(ModelMap model) {
		List<Tester> testers = new ArrayList<>();

		testerRepository.findAll().forEach(testers::add);
		for (Tester tester : testers) {
			System.out.println(tester);
		}
		return "adminLoginForm_page";
	}
}
