package com.solo.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(value="/toLogin.do")
	@ResponseBody
	public String toLogin(@RequestParam("username") String username,
			@RequestParam("password") String password){
		System.out.println(username+":"+password);
		return null;
	}
}
