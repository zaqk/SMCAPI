package com.smcapi.rest.dao.impl;

import java.util.Arrays;
import java.util.List;

import com.smcapi.rest.dao.SongManagerDao;
import com.smcapi.rest.model.Song;

public class SongManagerMemoryDao implements SongManagerDao {
	
	private Song song1 = new Song(true, true, true, true);
	private Song song2 = new Song(true, true, true, true);
	private Song song3 = new Song(true, true, true, true);
	private Song song4 = new Song(true, true, true, true);

	List<Song> songs = Arrays.asList(song1, song2, song3, song4);
	
	@Override
	public List<Song> search() {
		return songs;
	}

}
