package com.solo.dao.login;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Component;

import com.solo.bean.User;

public abstract class AbastractSelect extends MappingSqlQuery {
	
	public AbastractSelect(DataSource dataSource,String sql) {
		super(dataSource, sql);
	}
	
	public AbastractSelect() {
	}
	@Override
	protected Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User(rs.getLong("id"),rs.getString("name"),rs.getString("pwd"));
		return user;
	}
	
}
