package com.smcapi.rest.services.impl;

import com.smcapi.rest.dao.SongManagerDao;
import com.smcapi.rest.model.SongRequest;
import com.smcapi.rest.model.SongResponse;
import com.smcapi.rest.services.SongManager;

public class SongManagerService implements SongManager{
	
	private SongManagerDao songDao;
	
	public SongManagerDao getSongDao(){
		
		return songDao;
	}
	
	public void setSongDao(SongManagerDao songDao)
	{
		this.songDao = songDao;
	}
	
	public SongResponse search(SongRequest songRequest){
		
		SongResponse response = new SongResponse();
		
		try
		{
			response.setSongs(getSongDao().search(songRequest));
			System.out.println(response.getSongs().toString());
		}
		catch (Exception e)
		{
			response.setSuccess(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}

		return response;
	}

}
