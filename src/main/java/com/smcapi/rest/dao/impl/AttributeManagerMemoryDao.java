package com.smcapi.rest.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.smcapi.rest.dao.AttributeManagerDao;
import com.smcapi.rest.dao.mapper.AttributeServiceMapper;

public class AttributeManagerMemoryDao implements AttributeManagerDao{
	
	@Autowired
	private AttributeServiceMapper serviceMapper;
	
	@Override
	public List<String> getAttributes() {
		
		return serviceMapper.getAttributes();
	}

}
