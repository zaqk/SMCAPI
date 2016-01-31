package com.smcapi.rest.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.smcapi.util.Constants;

public class AttributeServiceMapper {
	private static final Logger log = LoggerFactory.getLogger(SongServiceMapper.class);

	   @Autowired
	    private SqlSession session;
	    
		public List<String> getAttributes() {
	        List<String> list = new ArrayList<String>();
	        
		try {
			list = session.selectList(Constants.DAO_MAP_GET_ATTRIBUTES);
			
	        } catch (Exception exception) {
	            log.error("getAttributes failed. Exception - ", exception);
	        }
	        
	        return list;
		}

}
