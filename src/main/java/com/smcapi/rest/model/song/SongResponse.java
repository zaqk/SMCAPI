package com.smcapi.rest.model.song;

import java.util.List;

public class SongResponse
{
	private List<Song> songs;
	private String errorMessage;
	private Boolean success = true;

	public List<Song> getSongs()
	{
		return songs;
	}

	public void setSongs(List<Song> songs)
	{
		this.songs = songs;
	}

	public Boolean isSuccess()
	{
		return success;
	}

	public void setSuccess(Boolean success)
	{
		this.success = success;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
}