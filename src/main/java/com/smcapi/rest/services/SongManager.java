package com.smcapi.rest.services;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.smcapi.rest.model.song.SongRequest;
import com.smcapi.rest.model.song.SongResponse;

@Produces("application/json")
public interface SongManager {
	
	@POST
	@Path("search")
	public SongResponse search(SongRequest songRequest);

}
