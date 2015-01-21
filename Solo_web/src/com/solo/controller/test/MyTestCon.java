package com.solo.controller.test;

import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solo.service.test.IMyTest;
import com.solo.util.JsonUtil;

@Controller
@RequestMapping(value="/mytest")
public class MyTestCon {
	
	@Autowired
	private IMyTest myTest ;
	
	@ResponseBody
	@RequestMapping(value = "/testmytest1.do")
	public String testMyTest(@RequestBody String qViewStr) throws Exception{
		Map<String,String> qView =JsonUtil.fromJsonToMap(qViewStr);
		System.out.println("testMyTest:qView===>"+qView.get("test2")); 
		
		return "{\"hello\":\"world\"}";
	}
}
