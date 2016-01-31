package com.smcapi.util;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AttributeTypeHandler extends BaseTypeHandler<Boolean> {
	
	private static final Logger log = LoggerFactory.getLogger(AttributeTypeHandler.class);

	private String convert(Boolean b) {
		log.info(b ? "attribute = 1::bit" : "attribute = 0::bit");
		return b ? "1" : "0";
	}

	private Boolean convert(String s) {
		return s.equals("1");
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, convert(parameter));

	}

	@Override
	public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return convert(rs.getString(columnName));
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return convert(rs.getString(columnIndex));
	}

	@Override
	public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return convert(cs.getString(columnIndex));
	}

}