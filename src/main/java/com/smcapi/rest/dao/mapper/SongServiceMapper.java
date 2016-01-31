package com.smcapi.rest.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.smcapi.rest.model.song.Song;
import com.smcapi.rest.model.song.SongRequest;
import com.smcapi.util.Constants;
import com.smcapi.util.VideoIdExtractor;


public class SongServiceMapper {
    private static final Logger log = LoggerFactory.getLogger(SongServiceMapper.class);

   @Autowired
    private SqlSession session;
    
	public List<Song> search(SongRequest songRequest) {
        List<Song> list = new ArrayList<Song>();
        VideoIdExtractor videoIdExtractor = new VideoIdExtractor();
        
	try {
		list = session.selectList(Constants.DAO_MAP_SEARCH, songRequest);
		list.forEach(song -> song.setVideoId(videoIdExtractor.getVideoId(song.getLink())));//set videoId based off of link
        	log.info("List fetched from search :: " + list);
        } catch (Exception exception) {
            log.error("search failed. Exception - ", exception);
        }
        
        return list;
	}
    
    
    
}
