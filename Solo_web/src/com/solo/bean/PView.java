package com.solo.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PView {
	private Map<String,String> pView = new HashMap<String,String>();

	
	public Map<String, String> getpView() {
		return pView;
	}

	public void setpView(Map<String, String> pView) {
		this.pView = pView;
	}
	
	
}
