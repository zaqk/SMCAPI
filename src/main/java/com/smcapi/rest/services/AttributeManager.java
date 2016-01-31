package com.smcapi.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.smcapi.rest.model.attribute.AttributeResponse;


@Produces("application/json")
public interface AttributeManager {
	
	@GET
	@Path("getAttributes")
	public AttributeResponse getAttributes();

}
