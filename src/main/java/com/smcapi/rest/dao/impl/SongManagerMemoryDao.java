package com.smcapi.rest.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.smcapi.main.Main;
import com.smcapi.rest.dao.SongManagerDao;
import com.smcapi.rest.dao.mapper.SongServiceMapper;
import com.smcapi.rest.model.Song;
import com.smcapi.rest.model.SongRequest;

public class SongManagerMemoryDao implements SongManagerDao {
	
	@Autowired
	private SongServiceMapper serviceMapper;
	
	List<Song> testSongs;

	public List<Song> search(SongRequest songRequest) {
		
		return serviceMapper.search(songRequest);
		
	}



	
	
}
