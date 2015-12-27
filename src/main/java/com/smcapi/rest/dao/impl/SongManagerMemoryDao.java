package com.smcapi.rest.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.smcapi.main.Main;
import com.smcapi.rest.dao.SongManagerDao;
import com.smcapi.rest.model.Song;

public class SongManagerMemoryDao implements SongManagerDao {
	
	private static final Logger log = Logger.getLogger(Main.class.getName());
	
	//JdbcTemplate jdbc;

	private Song song1 = new Song(true, true, true, true);
	private Song song2 = new Song(true, true, true, true);
	private Song song3 = new Song(true, true, true, true);
	private Song song4 = new Song(true, true, true, true);

	List<Song> songs = Arrays.asList(song1, song2, song3, song4);

	public List<Song> search() {
		return songs;
	}
	/*
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
		
	}
	*/
}
