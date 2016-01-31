package com.smcapi.rest.model.song;

import java.util.HashMap;
import java.util.Map;

public class Song{
	
	private String id;
	private String songName;
	private String link;
	private String videoId;
	private HashMap<String, Boolean> attributes;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getVideoId() {
		return videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	public HashMap<String, Boolean> getAttributes() {
		return attributes;
	}
	public void setAttributes(HashMap<String, Boolean> attributes) {
		this.attributes = attributes;
	}

}