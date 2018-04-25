package com.miwo.controller.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class UserTest {

	@Test
	public void testLogin() {
		String url="http://localhost:8080/user/login";
		Map<String,String> params=new HashMap<String,String>();
		params.put("uLoginName", "13032286690");
		params.put("uPassword", "13222");
		System.out.println(HttpClientMain.httpGet(url, params));
	}
	@Test
	public void testAddUser() {
		String url="http://localhost:8080/user/registeUser";
	}

}
