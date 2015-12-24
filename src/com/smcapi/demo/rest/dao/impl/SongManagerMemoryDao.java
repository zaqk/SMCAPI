package com.smcapi.demo.rest.dao.impl;

import java.util.Arrays;
import java.util.List;

import com.smcapi.demo.rest.dao.SongManagerDao;
import com.smcapi.demo.rest.model.Song;

public class SongManagerMemoryDao implements SongManagerDao {
	
	private Song song1 = new Song(true, true, true, true);
	private Song song2 = new Song(true, false, true, false);
	private Song song3 = new Song(false, true, false, true);
	private Song song4 = new Song(false, false, false, false);

	List<Song> songs = Arrays.asList(song1, song2, song3, song4);
	
	@Override
	public List<Song> search() {
		return songs;
	}

}
