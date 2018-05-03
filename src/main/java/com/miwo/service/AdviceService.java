package com.miwo.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miwo.dao.AdviceMapper;
import com.miwo.model.Advice;


@Service
public class AdviceService {
	@Autowired
	AdviceMapper adviceMapper;
	public boolean addAdvice(String content,Long userId) {
		// TODO Auto-generated method stub
		Advice advice =new Advice();
		advice.setAdviceContent(content);
		advice.setUserId(userId);
		advice.setAddDate(new Date());
		return adviceMapper.insert(advice)==1;
	}
}
