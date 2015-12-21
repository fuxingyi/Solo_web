package com.solo.dao.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.solo.bean.User;

@Repository(value="userDao")
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	private SelectByName selectByName ;
	
	private String sql = "select id,name,pwd from user where user.name = ? ";
	
	public List<User> selectByName(String name){
		selectByName = new SelectByName(jdbcTemplate.getDataSource(),sql);
		return selectByName.execute(new Object[]{name});
	}

	public SelectByName getSelectByName() {
		return selectByName;
	}

	public void setSelectByName(SelectByName selectByName) {
		this.selectByName = selectByName;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
	
	
}
