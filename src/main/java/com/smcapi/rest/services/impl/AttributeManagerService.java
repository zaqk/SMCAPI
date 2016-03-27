package com.smcapi.rest.services.impl;


import com.smcapi.rest.dao.AttributeManagerDao;
import com.smcapi.rest.model.attribute.AttributeResponse;
import com.smcapi.rest.services.AttributeManager;
import com.smcapi.util.Constants;

public class AttributeManagerService implements AttributeManager{
	
	private AttributeManagerDao attributeDao;
	
	public AttributeManagerDao getAttributeDao(){
		
		return attributeDao;
	}
	
	public void setAttributeDao(AttributeManagerDao attributeDao)
	{
		this.attributeDao = attributeDao;
	}
	

	public AttributeResponse getAttributes() {
		AttributeResponse response = new AttributeResponse();
		try {
			response.setAttributes(getAttributeDao().getAttributes());
			if(response.getAttributes().isEmpty()) {
				response.setErrorMessage(Constants.NO_RESULTS);
			}
		} catch (Exception e) {
			response.setSuccess(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}
		
		
		return response;
	}

}
