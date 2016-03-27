package com.smcapi.rest.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.smcapi.rest.dao.SongManagerDao;
import com.smcapi.rest.dao.mapper.SongServiceMapper;
import com.smcapi.rest.model.song.Song;
import com.smcapi.rest.model.song.SongRequest;

public class SongManagerMemoryDao implements SongManagerDao {
	
	@Autowired
	private SongServiceMapper serviceMapper;

	@Override
	public List<Song> search(SongRequest songRequest) {
		
		return serviceMapper.search(songRequest);
		
	}



	
	
}
