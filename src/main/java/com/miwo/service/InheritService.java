package com.miwo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miwo.dao.InheritMapper;
import com.miwo.model.Inherit;
import com.miwo.model.InheritExample;
import com.miwo.model.InheritExample.Criteria;
import com.miwo.vo.InheritCalculateVo;
import com.miwo.vo.InheritVo;


@Service
public class InheritService {
	@Autowired
	InheritMapper inheritMapper;
	
	public void addInherit(InheritVo inheritVo) {
		// TODO Auto-generated method stub
		Inherit inherit=new Inherit();
		inherit.setFatherType(inheritVo.getFatherType());
		inherit.setMotherType(inheritVo.getMotherType());
		inherit.setUserId(inheritVo.getUserId());
		for(String type:inheritVo.getChildren()) {
			inherit.setChildType(type);
			inheritMapper.insert(inherit);
		}
	}

	public String calInheritRate(InheritCalculateVo inheritCalVo) {
		// TODO Auto-generated method stub
		Map<String,Integer> typecnt=new HashMap<String,Integer>();
		List<Inherit> ret;
		if(inheritCalVo.isUseGender()||inheritCalVo.getFatherType().equals(inheritCalVo.getMotherType())) {
			InheritExample example=new InheritExample();
			Criteria criteria = example.createCriteria();
			criteria.andFatherTypeEqualTo(inheritCalVo.getFatherType());
			criteria.andMotherTypeEqualTo(inheritCalVo.getMotherType());
			ret=inheritMapper.selectByExample(example);
			
			
		}else {
			InheritExample example=new InheritExample();
			Criteria criteria = example.createCriteria();
			criteria.andFatherTypeEqualTo(inheritCalVo.getFatherType());
			criteria.andMotherTypeEqualTo(inheritCalVo.getMotherType());
			ret=inheritMapper.selectByExample(example);
			criteria.andFatherTypeEqualTo(inheritCalVo.getMotherType());
			criteria.andMotherTypeEqualTo(inheritCalVo.getFatherType());
			ret.addAll(inheritMapper.selectByExample(example));
		}
		if(ret.size()==0) {
			return "暂时没有该配对数据，期待更多蜜友分享数据!!!";
		}
		for(Inherit ih :ret) {
			String childType=ih.getChildType();
			if(typecnt.get(childType)!=null) {
				typecnt.put(ih.getChildType(), typecnt.get(childType)+1);
			}else {
				typecnt.put(ih.getChildType(), 1);
			}
		}
		StringBuffer sb=new StringBuffer();
		for(String type:typecnt.keySet()) {
			int percent=typecnt.get(type)*100/ret.size();
			sb.append(type+":"+percent+"%\r\n");
		}
		return sb.toString();
	}

	public long getUserCnt() {
		// TODO Auto-generated method stub;
		return inheritMapper.countUser();
	}
}
