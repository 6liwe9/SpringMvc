package com.miwo.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miwo.dao.MiPicMapper;
import com.miwo.model.MiPic;
import com.miwo.model.MiPicExample;
import com.miwo.model.User;


@Service
public class MiPicService {
	@Autowired
	MiPicMapper miPicMapper;
	@Autowired
	PicService picService;
	@Autowired
	UserService userService;
	public boolean saveMiPic(List<String> picIds, String userId, String type) {
		// TODO Auto-generated method stub
		MiPic mpic=new MiPic();
		for(String id :picIds) {
			mpic.setPicId(new Long(id));
			mpic.setType(type);
			mpic.setUserId(new Long(userId));
			mpic.setThumbDown(0l);
			mpic.setThumbUp(0l);
			if(miPicMapper.insert(mpic)!=1) {
				return false;
			}
		}
		return true;
	}
	public List getMiPicByPage(String type, int page,int size) {
		// TODO Auto-generated method stub
		Map<String,Object> param=new HashMap<String,Object>();
		if(!type.equals("所有类型"))
			param.put("type", type);
		else
			param.put("type", null);
		param.put("page", new Long((page-1)*size));
		param.put("size",size);
		List<MiPic> mipics= miPicMapper.selectByPage(param);
		List<Object> ret=new ArrayList<Object>();
		for(MiPic pic:mipics) {
			Map<String,Object> obj=new HashMap<String,Object>();
			obj.put("picId", pic.getPicId().toString());
			obj.put("url",picService.getUrlFromId(pic.getPicId()) );
			obj.put("like", pic.getThumbUp());
			obj.put("hate", pic.getThumbDown());
			Long userId=pic.getUserId();
			obj.put("userId",userId.toString() );
			User user=userService.getUser(userId);
			obj.put("avatar", user.getAvatarUrl());
			ret.add(obj);
		}
		return ret;
	}

	public List getMiPic(String type, int cnt) {
		// TODO Auto-generated method stub
		Map<String,Object> param=new HashMap<String,Object>();
		if(!type.equals("所有类型"))
			param.put("type", type);
		else
			param.put("type", null);
		param.put("cnt", new Long(cnt));
		List<MiPic> mipics= miPicMapper.selectRandom(param);
		List<Object> ret=new ArrayList<Object>();
		for(MiPic pic:mipics) {
			Map<String,Object> obj=new HashMap<String,Object>();
			obj.put("picId", pic.getPicId().toString());
			obj.put("url",picService.getUrlFromId(pic.getPicId()) );
			obj.put("like", pic.getThumbUp());
			obj.put("hate", pic.getThumbDown());
			ret.add(obj);
		}
		if(ret.size()<0) {
			return null;
		}
		while(ret.size()<cnt) {
			ret.addAll(ret);
		}
		return ret.subList(0, cnt);
	}

	public boolean valuePic(String picId, Long hate, Long like) {
		// TODO Auto-generated method stu
		MiPicExample example=new MiPicExample();
		example.createCriteria().andPicIdEqualTo(new Long(picId));
		List<MiPic> pics=miPicMapper.selectByExample(example);
		if(pics.size()!=1)
			return false;
		MiPic record=pics.get(0);
		record.setThumbUp(like);
		record.setThumbDown(hate);
		return miPicMapper.updateByExample(record, example)==1;
	}
	public Object getMiPicByUser(String userId) {
		// TODO Auto-generated method stub
		MiPicExample example=new MiPicExample();
		example.createCriteria().andUserIdEqualTo(new Long(userId));
		List<MiPic> mipics= miPicMapper.selectByExample(example);
		List<Object> ret=new ArrayList<Object>();
		for(MiPic pic:mipics) {
			Map<String,Object> obj=new HashMap<String,Object>();
			obj.put("picId",pic.getPicId().toString());
			obj.put("url",picService.getUrlFromId(pic.getPicId()) );
			obj.put("like", pic.getThumbUp());
			obj.put("hate", pic.getThumbDown());
			ret.add(obj);
		}
		return ret;
	}
	public Boolean delPic(String picId) {
		// TODO Auto-generated method stub
		MiPicExample example=new MiPicExample();
		example.createCriteria().andPicIdEqualTo(new Long(picId));
		return miPicMapper.deleteByExample(example)==1;

	}
	public Object getYesterdayMiPic(int page, int size) {
		// TODO Auto-generated method stub
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("page", new Long((page-1)*size));
		param.put("size",size);
		Date now=new Date();
		
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DATE,-1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
		Date time=calendar.getTime();
		param.put("day",time);
		List<MiPic> mipics= miPicMapper.selectByDay(param);
		List<Object> ret=new ArrayList<Object>();
		for(MiPic pic:mipics) {
			Map<String,Object> obj=new HashMap<String,Object>();
			obj.put("picId", pic.getPicId().toString());
			obj.put("url",picService.getUrlFromId(pic.getPicId()) );
			obj.put("like", pic.getThumbUp());
			obj.put("hate", pic.getThumbDown());
			Long userId=pic.getUserId();
			obj.put("userId",userId.toString() );
			User user=userService.getUser(userId);
			obj.put("avatar", user.getAvatarUrl());
			ret.add(obj);
		}
		return ret;
	}

}
