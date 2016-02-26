package com.smcapi.rest.model;

public abstract class Response {
	
	public abstract String getErrorMessage();
	
	public abstract void setErrorMessage(String errorMessage);
	
	public abstract Boolean isSuccess();
	
	public abstract void setSuccess(Boolean success);

}
