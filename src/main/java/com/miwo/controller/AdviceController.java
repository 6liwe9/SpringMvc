package com.miwo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miwo.service.AdviceService;
import com.miwo.utils.Result;

@Controller
@RequestMapping("/advice")
public final class AdviceController {
	@Autowired
	AdviceService adviceService;
	@RequestMapping(value = "addAdvice.do", method = RequestMethod.POST)
	@ResponseBody
	public Result addAdvice(String adviceContent,String userId)  {
		if(adviceService.addAdvice(adviceContent, new Long(userId)))
			return Result.buildSuccessReslut(null);
		else
			return Result.buildFailReslut(null);
		
	}
	
}
