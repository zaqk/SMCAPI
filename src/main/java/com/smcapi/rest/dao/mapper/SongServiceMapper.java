package com.smcapi.rest.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.smcapi.main.Constants;
import com.smcapi.rest.model.Song;
import com.smcapi.rest.model.SongRequest;


public class SongServiceMapper {
    private static final Logger log = LoggerFactory.getLogger(SongServiceMapper.class);

   @Autowired
    private SqlSession session;
    
	public List<Song> search(SongRequest songRequest) {
        log.info("search initiated");
        List<Song> list = new ArrayList<Song>();
        
        try {
            list = session.selectList(Constants.DAO_MAP_SEARCH, songRequest);
            log.info("List fetched from search :: " + list);
        } catch (Exception exception) {
            log.error("search failed. Exception - ", exception);
        }
        
        return list;
	}
    
    
    
}
