package com.smcapi.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.smcapi.rest.model.SongResponse;

@Produces("application/json")
public interface SongManager {
	
	@GET
	@Path("search")
	public SongResponse search();

}
