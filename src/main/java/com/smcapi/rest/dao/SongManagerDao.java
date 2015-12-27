package com.smcapi.rest.dao;

import java.util.List;

import javax.sql.DataSource;

import com.smcapi.rest.model.Song;

public interface SongManagerDao {
	
	//public void setDataSource(DataSource jdbc);
	
	public List<Song> search();

}
