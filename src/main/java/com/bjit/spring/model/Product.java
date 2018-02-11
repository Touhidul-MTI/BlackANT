package com.bjit.spring.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int id;

	@Column(name = "product_name", length = 64, nullable = false)
	private String productName;

	@Column(name = "product_quantity")
	private int productQuantity;

	@Column(name = "original_price")
	private int originalPrice;

	@Column(name = "discount_price", columnDefinition = "int default 0")
	private int discountPrice;

	@Column(name = "product_description", columnDefinition = "text")
	private String productDescription;

	@Column(name = "product_image", length = 128)
	private String productImage;
	
	// @Column(name = "category_id")
	// private String categoryId;

	@Column(name = "created_on", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp createdOn;

	@Column(name = "updated_on", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp updatedOn;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String productName, int productQuantity, int originalPrice, int discountPrice,
			String productDescription, String productImage, Timestamp createdOn, Timestamp updatedOn,
			Category category) {
		super();
		this.id = id;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.originalPrice = originalPrice;
		this.discountPrice = discountPrice;
		this.productDescription = productDescription;
		this.productImage = productImage;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productQuantity=" + productQuantity
				+ ", originalPrice=" + originalPrice + ", discountPrice=" + discountPrice + ", productDescription="
				+ productDescription + ", productImage=" + productImage + ", createdOn=" + createdOn + ", updatedOn="
				+ updatedOn + ", category=" + category.getCategoryName() + "]";
	}

	 
}
