package com.miwo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.miwo.dao.UserMapper;
import com.miwo.model.User;
import com.miwo.model.UserExample;
import com.miwo.model.UserExample.Criteria;
import com.miwo.utils.HttpClientMain;
import com.miwo.utils.IDGenerator;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	/**
	 * 新增用户
	 * 
	 * @param user
	 */
	public Long login(User user) {

		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		if(user.getOpenId().equals("null"))
			return null;
		criteria.andOpenIdEqualTo(user.getOpenId());
		List<User> userl = userMapper.selectByExample(example);
		if (userl.size() == 0) {
			Long id = IDGenerator.getid();
			user.setUserId(id);
			if (userMapper.insert(user) == 1)
				return id;
			else
				return -1l;
		} else
			return userl.get(0).getUserId();

	}
	public Boolean updateUser(User user) {
		if(user.getUserId()==null)
			return false;
		User u=userMapper.selectByPrimaryKey(user.getUserId());
		u.setAvatarUrl(user.getAvatarUrl());
		u.setNickname(user.getNickname());
		return userMapper.updateByPrimaryKey(u)==1;
	}

	public User getUser(long userId) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<User> userl = userMapper.selectByExample(example);
		if (userl.size() > 0)
			return userl.get(0);
		else
			return null;
	}

	public Object code2id(String js_code, String appid, String secret, String grant_type) {
		// TODO Auto-generated method stub
		String url="https://api.weixin.qq.com/sns/jscode2session";
		Map<String,String> params=new HashMap<String,String>();
		params.put("js_code", js_code);
		params.put("appid", appid);
		params.put("secret", secret);
		params.put("grant_type", grant_type);
		String ret=HttpClientMain.httpGet(url, params);
		Map retmap=new Gson().fromJson(ret, Map.class);
		return retmap.get("openid");
	}
}
