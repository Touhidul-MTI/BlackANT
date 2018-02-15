package com.bjit.spring.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="userdetail")
public class UserDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	
	@NotEmpty(message = "Enter first name.")
	@Column(name="user_first_name", length=64)
	private String userFirstName;
	
	@NotEmpty(message = "Enter last name.")
	@Column(name="user_last_name", length=64)
	private String userLastName;
	
	@Email(message = "Enter a valid email.")
	@Column(name="user_email", length=64)
	private String userEmail;
	
	@NotEmpty(message = "Enter password.")
	@Column(name="user_password", length=128)
	private String userPassword;
	
	@NotEmpty(message = "Enter mobile.")
	@Column(name="user_mobile", length=64)
	private String userMobile;
	
	@Column(name="user_status", columnDefinition = "int default 0", length=3)
	private String userStatus;
	
	@NotEmpty(message = "Enter billing address.")
	@Column(name="user_billing_address", length=128)
	private String userBillingAddress;
	
	@NotEmpty(message = "Enter billing city.")
	@Column(name="user_billing_city", length=128)
	private String userBillingCity;
	
	@NotEmpty(message = "Enter zipcode.")
	@Column(name="user_billing_zip_code", length=8)
	private String userBillingZipCode;
	
//	@Column(name="user_billing_country_id", length=64)
//	private String userBillingCountryId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "user_billing_country_id",referencedColumnName="country_id",insertable=false, updatable=false)
	private Country userBillingCountry;
	
	@NotEmpty(message = "Enter shipping address.")
	@Column(name="user_shipping_address", length=64)
	private String userShippingAddress;
	
	@NotEmpty(message = "Enter city.")
	@Column(name="user_shipping_city", length=64)
	private String userShippingCity;
	
	@NotEmpty(message = "Enter zipcode.")
	@Column(name="user_shipping_zip_code", length=64)
	private String userShippingZipCode;
	
//	@Column(name="user_shipping_country_id", length=64)
//	private String userShippingCountryId;
	 
	@ManyToOne(optional = false)
	@JoinColumn(name = "user_shipping_country_id",referencedColumnName="country_id",insertable=false, updatable=false)
	private Country userShippingCountry;
	
	@Column(name = "created_on", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp createdOn;

	@Column(name = "updated_on", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp updatedOn;

	public UserDetail() {
		
	}

	public UserDetail(int id, String userFirstName, String userLastName, String userEmail, String userPassword,
			String userMobile, String userStatus, String userBillingAddress, String userBillingCity,
			String userBillingZipCode, Country userBillingCountry, String userShippingAddress, String userShippingCity,
			String userShippingZipCode, Country userShippingCountry, Timestamp createdOn, Timestamp updatedOn) {
		super();
		this.id = id;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userMobile = userMobile;
		this.userStatus = userStatus;
		this.userBillingAddress = userBillingAddress;
		this.userBillingCity = userBillingCity;
		this.userBillingZipCode = userBillingZipCode;
		this.userBillingCountry = userBillingCountry;
		this.userShippingAddress = userShippingAddress;
		this.userShippingCity = userShippingCity;
		this.userShippingZipCode = userShippingZipCode;
		this.userShippingCountry = userShippingCountry;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserBillingAddress() {
		return userBillingAddress;
	}

	public void setUserBillingAddress(String userBillingAddress) {
		this.userBillingAddress = userBillingAddress;
	}

	public String getUserBillingCity() {
		return userBillingCity;
	}

	public void setUserBillingCity(String userBillingCity) {
		this.userBillingCity = userBillingCity;
	}

	public String getUserBillingZipCode() {
		return userBillingZipCode;
	}

	public void setUserBillingZipCode(String userBillingZipCode) {
		this.userBillingZipCode = userBillingZipCode;
	}

	public Country getUserBillingCountry() {
		return userBillingCountry;
	}

	public void setUserBillingCountry(Country userBillingCountry) {
		this.userBillingCountry = userBillingCountry;
	}

	public String getUserShippingAddress() {
		return userShippingAddress;
	}

	public void setUserShippingAddress(String userShippingAddress) {
		this.userShippingAddress = userShippingAddress;
	}

	public String getUserShippingCity() {
		return userShippingCity;
	}

	public void setUserShippingCity(String userShippingCity) {
		this.userShippingCity = userShippingCity;
	}

	public String getUserShippingZipCode() {
		return userShippingZipCode;
	}

	public void setUserShippingZipCode(String userShippingZipCode) {
		this.userShippingZipCode = userShippingZipCode;
	}

	public Country getUserShippingCountry() {
		return userShippingCountry;
	}

	public void setUserShippingCountry(Country userShippingCountry) {
		this.userShippingCountry = userShippingCountry;
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

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userMobile=" + userMobile
				+ ", userStatus=" + userStatus + ", userBillingAddress=" + userBillingAddress + ", userBillingCity="
				+ userBillingCity + ", userBillingZipCode=" + userBillingZipCode + ", userBillingCountry="
				+ userBillingCountry + ", userShippingAddress=" + userShippingAddress + ", userShippingCity="
				+ userShippingCity + ", userShippingZipCode=" + userShippingZipCode + ", userShippingCountry="
				+ userShippingCountry + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	
}
