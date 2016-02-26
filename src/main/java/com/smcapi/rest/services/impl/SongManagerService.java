package com.smcapi.rest.services.impl;

import com.smcapi.rest.dao.SongManagerDao;
import com.smcapi.rest.model.song.SongRequest;
import com.smcapi.rest.model.song.SongResponse;
import com.smcapi.rest.services.SongManager;
import com.smcapi.util.Constants;

public class SongManagerService implements SongManager{
	
	private SongManagerDao songDao;
	
	public SongManagerDao getDao(){
		
		return songDao;
	}
	
	public void setDao(SongManagerDao songDao)
	{
		this.songDao = songDao;
	}
	
	public SongResponse search(SongRequest songRequest){
		
		SongResponse response = new SongResponse();
		
		try {
			response.setSongs(getDao().search(songRequest));
			if(response.getSongs().isEmpty()) {
				response.setErrorMessage(Constants.NO_RESULTS);
			}
		} catch (Exception e) {
			response.setSuccess(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}

		return response;
	}

}
