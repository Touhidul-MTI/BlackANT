package com.bjit.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="admin_id")
	private int id;
	
	@Column(name="admin_name", length=64)
	private String name;
	
	@Column(name="admin_email", length=64)
	private String email;
	
	@Column(name="admin_password", length=128)
	private String password;
	
	public Admin() {
	}
	public Admin(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
}
