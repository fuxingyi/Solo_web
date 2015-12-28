package com.solo.dao.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.danga.MemCached.MemCachedClient;
import com.solo.system.ToMapMapper;

@Repository
public class MyTestDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	@Autowired
	@Qualifier(value="memcachedClient")
	private MemCachedClient memcachedClient;   
	
	public List<Map<String,Object>> selectAll(){
		
		System.out.println(this.memcachedClient.add("test1", "this is test1 value;"));
		
		List<Map<String,Object>> data = 
				jdbcTemplate.query("select ID,name,age,hobby,comment from mytest",new ToMapMapper());
		return data;
	}

	public JdbcTemplate getJdbcTemplate() { 
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public MemCachedClient getMemcachedClient() {
		return memcachedClient;
	}

	public void setMemcachedClient(MemCachedClient memcachedClient) {
		this.memcachedClient = memcachedClient;
	}
	
	
}
