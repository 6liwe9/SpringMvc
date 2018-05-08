package com.miwo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miwo.dao.MyMapMapper;
import com.miwo.model.MyMap;
import com.miwo.model.MyMapExample;
import com.miwo.model.User;


@Service
public class MapService {
	@Autowired
	MyMapMapper mapMapper;
	@Autowired
	UserService userService;
	public boolean updateUser(Long userId,Double latitude,Double longitude) {
		MyMapExample example=new MyMapExample();
		example.createCriteria().andUserIdEqualTo(userId);
		// TODO Auto-generated method stub
		List<MyMap> list=mapMapper.selectByExample(example);
		if(list.size()==1) {
			MyMap map=list.get(0);
			map.setLatitude(latitude);
			map.setLongitude(longitude);
			return mapMapper.updateByExample(map, example)==1;
		}else if(list.size()==0) {
			MyMap map=new MyMap();
			map.setLatitude(latitude);
			map.setLongitude(longitude);
			map.setUserId(userId);
			return mapMapper.insert(map)==1;
		}
		return false;
	}
	public List getUsers() {
		MyMapExample example=new MyMapExample();
		// TODO Auto-generated method stub
		List<MyMap> list=mapMapper.selectByExample(example);
		List<Object> ret=new ArrayList<Object>();
		for(MyMap map:list) {
			Map<String,Object> obj=new HashMap<String,Object>();
			obj.put("userId", map.getUserId().toString());
			obj.put("latitude", map.getLatitude());
			obj.put("longitude", map.getLongitude());
			User user=userService.getUser(map.getUserId());
			if(user!=null) {
				obj.put("userName", user.getNickname());
			}
			ret.add(obj);
		}
		return ret;
	}
}
