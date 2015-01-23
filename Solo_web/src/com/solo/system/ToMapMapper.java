package com.solo.system;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

/**
 * 将resultset数据转化成Map<String,Object>
 * @author zangbx
 * @version 1.0
 */
public class ToMapMapper implements RowMapper<Map<String,Object>>  {

	@Override
	public Map<String,Object> mapRow(ResultSet result, int rowNum) throws SQLException {
		Map<String,Object> data = new HashMap<String,Object>();
		ResultSetMetaData metaData = result.getMetaData();
		int index = metaData.getColumnCount();
		for(int i=1;i<=index;i++){
			String columnName = metaData.getColumnName(i);
			data.put(columnName, result.getObject(columnName));
		}
		return data;
	}

}
