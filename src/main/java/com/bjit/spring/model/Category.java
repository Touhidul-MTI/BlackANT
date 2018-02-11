package com.bjit.spring.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	private int id;

	@Column(name = "category_name", length = 64, nullable = false)
	private String categoryName;

	@Column(name = "parent_category_id", columnDefinition = "int default 0")
	private int parentCategoryId;

	@Column(name = "created_on", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp createdOn;

	@Column(name = "updated_on", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp updatedOn;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<Product> products;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int id, String categoryName, int parentCategoryId, List<Product> products) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.parentCategoryId = parentCategoryId;
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getParentCategoryId() {
		return parentCategoryId;
	}

	public void setParentCategoryId(int parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", parentCategoryId=" + parentCategoryId
				+ ", products=" + products + "]";
	}

	
}
