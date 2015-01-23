package com.solo.dao.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.solo.system.ToMapMapper;

@Repository
public class MyTestDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	public List<Map<String,Object>> selectAll(){
		List<Map<String,Object>> data = 
				jdbcTemplate.query("select ID,name,age,hobby,comment from mytest",new ToMapMapper());
		return data;
	}
	
//	protected class DataMapper implements RowMapper<Map<String,Object>>{
//		@Override
//		public Map<String,Object> mapRow(ResultSet result, int rowNum) throws SQLException {
//			Map<String,Object> data = new HashMap<String,Object>();
//			ResultSetMetaData metaData = result.getMetaData();
//			int index = metaData.getColumnCount();
//			for(int i=0;i<index;i++){
//				String columnName = metaData.getColumnName(i);
//				data.put(columnName, result.getObject(columnName));
//			}
//			return data;
//		}
//	}

	
}
