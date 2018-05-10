package com.miwo.controller.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class UserTest {

	@Test
	public void testLogin() {
		String url="https://api.weixin.qq.com/sns/jscode2session";
		Map<String,String> params=new HashMap<String,String>();
		params.put("js_code", "0211AZww1Oub0b0TJQyw1Jm8xw11AZwE");
		params.put("appid", "wx29669aff988ce16f");
		params.put("secret", "aa9efe070558db0dadc603417791d94c");
		params.put("grant_type", "authorization_code");
		System.out.println(HttpClientMain.httpGet(url, params));
	}
	@Test
	public void testAddUser() {
		String url="http://localhost:8080/user/registeUser";
	}

}
