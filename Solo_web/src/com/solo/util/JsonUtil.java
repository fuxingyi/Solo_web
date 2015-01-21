package com.solo.util;

import java.util.Map;

import net.sf.json.JSONObject;

public class JsonUtil {
		
	@SuppressWarnings("unchecked")
	public static Map<String,String> fromJsonToMap(String json){
		return StringUtil.isEmpty(json)?null:(Map<String,String>)JSONObject.fromObject(json);
	}
	public static JSONObject fromJsonToObject(String json){
		return StringUtil.isEmpty(json)?null:JSONObject.fromObject(json);
	}
	public static String fromObjectToJson(Object object){
		return object==null?"":JSONObject.fromObject(object).toString();
	}
}
