package com.bjit.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tester")
public class Tester {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tester_id")
	private int id;
	
	@Column(name="tester_name")
	private String tester_name;

	public Tester() {
		
	}

	public Tester(int id, String tester_name) {
		super();
		this.id = id;
		this.tester_name = tester_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTester_name() {
		return tester_name;
	}

	public void setTester_name(String tester_name) {
		this.tester_name = tester_name;
	}

	@Override
	public String toString() {
		return "Tester [id=" + id + ", tester_name=" + tester_name + "]";
	}
	
	
}
