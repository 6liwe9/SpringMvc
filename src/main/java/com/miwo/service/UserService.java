package com.miwo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miwo.dao.UserMapper;
import com.miwo.model.User;
import com.miwo.model.UserExample;
import com.miwo.model.UserExample.Criteria;
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
}
