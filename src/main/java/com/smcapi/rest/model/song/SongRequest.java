package com.smcapi.rest.model.song;

import java.util.HashMap;

public class SongRequest {
	
	private HashMap<String, String> songs;
	
	private HashMap<String, Boolean> attributes;

	public HashMap<String, Boolean> getAttributes() {
		return attributes;
	}

	public void setAttributes(HashMap<String, Boolean> attributes) {
		this.attributes = attributes;
	}

	public HashMap<String, String> getSongs() {
		return songs;
	}

	public void setSongs(HashMap<String, String> songs) {
		this.songs = songs;
	}
}
