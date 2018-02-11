package com.bjit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.spring.model.Admin;
import com.bjit.spring.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	public List<Admin> getAllAdmins() {
		List<Admin> admins = new ArrayList<>();

		adminRepository.findAll().forEach(admins::add);
		return admins;
	}
	public Admin getAdmin(int adminId) {
		return adminRepository.findOne(adminId);
	}

	public void addAdmin(Admin admin) {
		adminRepository.save(admin);
	}

	public void updateAdmin(Admin admin) {
		adminRepository.save(admin);
	}

	public void deleteAdmin(int adminId) {
		adminRepository.delete(adminId);
	}
}