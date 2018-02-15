package com.bjit.spring.ajaxtest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private int id;
	
	@Column(name = "first_name", length = 64, nullable = false)
	@NotEmpty(message = "Enter first name.")
	private String firstName;

	@Column(name = "last_name", length = 64, nullable = false)
	@NotEmpty(message = "Enter last name.")
	private String lastName;

	@Column(name = "email", length = 64, nullable = false)
	@NotEmpty(message = "Enter email.")
	@Email(message = "Enter a valid email.")
	private String email;

	@Column(name = "designation", length = 64, nullable = false)
	@NotEmpty(message = "Enter your designation.")
	private String designation;

	public Employee() {
		
	}

	public Employee(int id, String firstName, String lastName, String email, String designation) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", designation=" + designation + "]";
	}

	
	
}
