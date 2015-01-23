package com.solo.service.test;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IMyTest {
	public List<Map<String,Object>> queryAll();
}
