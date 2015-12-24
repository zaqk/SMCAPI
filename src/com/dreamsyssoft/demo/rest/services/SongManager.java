package com.dreamsyssoft.demo.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.dreamsyssoft.demo.rest.model.SongResponse;

@Produces("application/json")
public interface SongManager {
	
	@GET
	@Path("/search/")
	public SongResponse search();

}
