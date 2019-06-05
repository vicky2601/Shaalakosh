package org.shaalakosh.auth.response.dto;

public class CustomUserResponse {
	String userManagmentRequestId;
	Object customResponse;
	
	public String getUserManagmentRequestId() {
		return userManagmentRequestId;
	}
	public void setUserManagmentRequestId(String userManagmentRequestId) {
		this.userManagmentRequestId = userManagmentRequestId;
	}
	public Object getCustomResponse() {
		return customResponse;
	}
	public void setCustomResponse(Object customResponse) {
		this.customResponse = customResponse;
	}
	
	
}
