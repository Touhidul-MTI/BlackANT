package com.bjit.spring.ajaxtest;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

public class EmployeeJsonResponse {
	private Employee employee;
	private boolean validated;
	private List<Employee> employeeList;
	private Map<String, String> errorMessages;
	private Page<Employee> pages;

	public EmployeeJsonResponse() {

	}

	public EmployeeJsonResponse(Employee employee, boolean validated, List<Employee> employeeList,
			Map<String, String> errorMessages, Page<Employee> pages) {
		super();
		this.employee = employee;
		this.validated = validated;
		this.employeeList = employeeList;
		this.errorMessages = errorMessages;
		this.pages = pages;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public Map<String, String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(Map<String, String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public Page<Employee> getPages() {
		return pages;
	}

	public void setPages(Page<Employee> pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "EmployeeJsonResponse [employee=" + employee + ", validated=" + validated + ", employeeList="
				+ employeeList + ", errorMessages=" + errorMessages + ", pages=" + pages + "]";
	}

	
}
