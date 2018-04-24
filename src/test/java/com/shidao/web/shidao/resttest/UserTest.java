package com.shidao.web.shidao.resttest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.shidao.web.vo.UserVO;

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
		UserVO user=new UserVO();
		user.setuAge(12);
		user.setuLoginName("13032286690");
		user.setuPassword("123");
		System.out.println(HttpClientMain.httpPost(url, user));
	}

}
