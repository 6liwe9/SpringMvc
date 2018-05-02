package com.miwo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miwo.dao.TakeawayMapper;
import com.miwo.model.Takeaway;
import com.miwo.model.TakeawayExample;
import com.miwo.model.TakeawayExample.Criteria;

@Service
public class TakeawayService {
	@Autowired
	TakeawayMapper takeMapper;
	public boolean insertTakeAway(Long articleId,Long userId,String type) {
		Takeaway take=new Takeaway();
		take.setArticleId(articleId);
		take.setType(type);
		take.setUserId(userId);
		return takeMapper.insert(take)==1;
	}
	public List<Long> getTakeAway(String userId,String type,int start,int limit){
		TakeawayExample example=new TakeawayExample();
		Criteria criteria = example.createCriteria();
		if(type!=null&&type!="")
			criteria.andTypeEqualTo(type);
		if(userId!=null&&userId!="")
			criteria.andUserIdEqualTo(new Long(userId));
		List<Takeaway> retList=takeMapper.selectByExample(example);
		retList=retList.subList(start, limit);
		List<Long>ret =new ArrayList<Long>();
		for(Takeaway t:retList) {
			ret.add(t.getArticleId());
		}
		return ret;
	}
}
