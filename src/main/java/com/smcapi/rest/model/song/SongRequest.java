package com.smcapi.rest.model.song;

import java.util.HashMap;

public class SongRequest {
	
	private HashMap<String, Boolean> attributes;
	
	public SongRequest(){
		
	}
	
	public SongRequest(HashMap<String, Boolean> attributes){
		this.attributes = attributes;
	}

	public HashMap<String, Boolean> getAttributes() {
		return attributes;
	}

	public void setAttributes(HashMap<String, Boolean> attributes) {
		this.attributes = attributes;
	}
}
