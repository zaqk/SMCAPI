package com.smcapi.rest.model.attribute;

import java.util.List;

import com.smcapi.rest.model.Response;

public class AttributeResponse extends Response{

	private List<String> attributes;
	private String errorMessage;
	private Boolean success = true;
	
	public List<String> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Boolean isSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
}
