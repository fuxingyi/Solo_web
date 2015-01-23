package com.solo.controller.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solo.service.test.IMyTest;

@Controller
@RequestMapping(value="/mytest")
public class MyTestCon {
	
	@Autowired
	private IMyTest myTest ;
	
	@ResponseBody
	@RequestMapping(value = "/testmytest1.do")
	public Map<String,Object> testMyTest(@RequestBody Map<String,Object> pView){
		System.out.println("testMyTest:pView===>"+pView.get("test2")); 
		
		Map<String,Object> view = new HashMap<String,Object>();
		List<Map<String,Object>> data = myTest.queryAll();
		System.out.println(data.toString());
		view.put("data", data);
		return view;
	}
	@ResponseBody
	@RequestMapping("/testmytest2/{num}.do")
	public Map<String,String> testMyTest2(@PathVariable("num") Integer num){
		System.out.println("testMyTest2:num====>"+num);
		Map<String,String> status = new HashMap<String,String>();
		status.put("0000", "²Ù×÷³É¹¦");
		return status;
	}
}
