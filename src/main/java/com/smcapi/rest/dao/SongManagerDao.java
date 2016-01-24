package com.smcapi.rest.dao;

import java.util.List;


import com.smcapi.rest.model.Song;
import com.smcapi.rest.model.SongRequest;

public interface SongManagerDao {
	
	public List<Song> search(SongRequest songRequest);

}
