package com.solo.controller.test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solo.service.test.IMyTest;

@Controller
@RequestMapping(value="/mytest")
public class MyTestCon {
	
	@Autowired
	private IMyTest myTest ;
	
	@ResponseBody
	@RequestMapping(value = "/testmytest1.do")
	public String testMyTest(
			@RequestParam(value="qView") String qView
			) throws Exception{
		System.out.println("testMyTest:qView===>"+qView.toString());
		
		return "hello=world";
	}
}
