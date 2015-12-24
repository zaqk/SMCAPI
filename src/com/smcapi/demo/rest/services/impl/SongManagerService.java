package com.smcapi.demo.rest.services.impl;

import com.smcapi.demo.rest.dao.SongManagerDao;
import com.smcapi.demo.rest.model.SongResponse;
import com.smcapi.demo.rest.services.SongManager;

public class SongManagerService implements SongManager{
	
	private SongManagerDao songDao;
	
	public SongManagerDao getSongDao(){
		
		return songDao;
	}
	
	public void setSongDao(SongManagerDao songDao)
	{
		this.songDao = songDao;
	}
	
	@Override
	public SongResponse search(){
		
		SongResponse response = new SongResponse();
		
		try
		{
			response.setSongs(getSongDao().search());
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
