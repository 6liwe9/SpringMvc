package com.miwo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miwo.dao.TakeawayMapper;
import com.miwo.model.MiPic;
import com.miwo.model.Takeaway;
import com.miwo.model.TakeawayExample;
import com.miwo.model.TakeawayExample.Criteria;

@Service
public class TakeawayService {
	@Autowired
	TakeawayMapper takeMapper;

	public boolean insertTakeAway(Long articleId, Long userId, String type) {
		Takeaway take = new Takeaway();
		take.setArticleId(articleId);
		take.setType(type);
		take.setUserId(userId);
		return takeMapper.insert(take) == 1;
	}

	public List<Long> getTakeAway(String userId, String type, Integer page, Integer size) {
		Map<String, Object> param = new HashMap<String, Object>();
		if (type != null&&!type.equals(""))
			param.put("type", type);
		if ( userId != null&&!userId.equals("") )
			param.put("userId", userId);
		else
			param.put("userId", null);
		if (page != null && size != null) {
			param.put("page", new Long((page - 1) * size));
			param.put("size", size);
		}
		List<Takeaway> retList = takeMapper.selectByPage(param);
		// retList=retList.subList(start, limit);
		List<Long> ret = new ArrayList<Long>();
		for (Takeaway t : retList) {
			ret.add(t.getArticleId());
		}
		return ret;
	}

	public boolean delTakeAway(Long articleId) {
		TakeawayExample example = new TakeawayExample();
		example.createCriteria().andArticleIdEqualTo(articleId);
		return takeMapper.deleteByExample(example) == 1;
	}
}
