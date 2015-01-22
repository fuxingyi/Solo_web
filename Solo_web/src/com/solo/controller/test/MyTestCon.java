package com.solo.controller.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solo.bean.PView;
import com.solo.service.test.IMyTest;
import com.solo.util.JsonUtil;

@Controller
@RequestMapping(value="/mytest")
public class MyTestCon {
	
	@Autowired
	private IMyTest myTest ;
	
	@ResponseBody
	@RequestMapping(value = "/testmytest1.do")
	public Map<String,Object> testMyTest(@RequestBody Map<String,Object> pView) throws Exception{
		//Map<String,String> pView =JsonUtil.fromJsonToMap(pViewStr);
		System.out.println("testMyTest:pView===>"+pView.get("test2")); 
		List<String> list = new ArrayList<String>();
		list.add("str1");
		list.add("str2");
		pView.put("list", list);
		
		return pView;
	}
}
