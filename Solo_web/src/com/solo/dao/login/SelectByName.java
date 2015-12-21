package com.solo.dao.login;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Component;

public class SelectByName extends AbastractSelect {

	public SelectByName() {
	}
	
	public SelectByName(DataSource dataSource, String sql) {
		super(dataSource, sql);
		this.declareParameter(new SqlParameter(Types.VARCHAR));
	}
	

}
