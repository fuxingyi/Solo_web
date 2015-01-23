package com.solo.service.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solo.dao.test.MyTestDao;

@Service
public class MyTest implements IMyTest {
	
	@Autowired
	private MyTestDao dao ;
	
	@Override
	public List<Map<String, Object>> queryAll() {
		return dao.selectAll();
	}
	
}
