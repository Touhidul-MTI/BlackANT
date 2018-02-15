package com.bjit.spring.model;

import java.util.Map;

public class UserDetailJsonResponse {
	private UserDetail userDetail;
	private boolean validated;
	private Map<String, String> errorMessages;
	public UserDetailJsonResponse() {

	}
	public UserDetailJsonResponse(UserDetail userDetail, boolean validated, Map<String, String> errorMessages) {
		super();
		this.userDetail = userDetail;
		this.validated = validated;
		this.errorMessages = errorMessages;
	}
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	public boolean isValidated() {
		return validated;
	}
	public void setValidated(boolean validated) {
		this.validated = validated;
	}
	public Map<String, String> getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(Map<String, String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	@Override
	public String toString() {
		return "UserDetailResponse [userDetail=" + userDetail + ", validated=" + validated + ", errorMessages="
				+ errorMessages + "]";
	}
	
}
