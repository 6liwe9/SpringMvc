package com.miwo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miwo.dao.MiPicMapper;
import com.miwo.model.MiPic;
import com.miwo.model.MiPicExample;


@Service
public class MiPicService {
	@Autowired
	MiPicMapper miPicMapper;
	@Autowired
	PicService picService;
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
		return ret;
	}

	public boolean valuePic(String picId, Long hate, Long like) {
		// TODO Auto-generated method stu
		
		MiPic record=new MiPic();
		record.setThumbUp(like);
		record.setThumbDown(hate);
		MiPicExample example=new MiPicExample();
		example.createCriteria().andPicIdEqualTo(new Long(picId));
		return miPicMapper.updateByExample(record, example)==1;
	}

}
