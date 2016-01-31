package com.smcapi.rest.dao;

import java.util.List;

import com.smcapi.rest.model.song.Song;
import com.smcapi.rest.model.song.SongRequest;

public interface SongManagerDao {
	
	public List<Song> search(SongRequest songRequest);

}
