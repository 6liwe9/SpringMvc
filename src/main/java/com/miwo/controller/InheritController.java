package com.miwo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.miwo.model.User;
import com.miwo.service.InheritService;
import com.miwo.service.UserService;
import com.miwo.utils.Result;
import com.miwo.vo.InheritCalculateVo;
import com.miwo.vo.InheritVo;

@Controller
@RequestMapping("/inherit")
public final class InheritController {
	@Autowired
	InheritService inheritService;
	@RequestMapping(value="inherit_add.do",method= RequestMethod.POST)
	@ResponseBody
	public  Result addInheritInfo(InheritVo inheritVo) {
		inheritService.addInherit(inheritVo);
		return Result.buildSuccessReslut(null); 
	}
	@RequestMapping(value="inherit_calculate.do",method= RequestMethod.POST)
	@ResponseBody
	public  Result calculateRate(InheritCalculateVo inheritCalVo) {
		String resutl=inheritService.calInheritRate(inheritCalVo);
		return Result.buildSuccessReslut(resutl); 
	}

	@RequestMapping(value="inherit_cnt.do",method= RequestMethod.GET)
	@ResponseBody
	public  Result getUserCnt() {
		return Result.buildSuccessReslut(inheritService.getUserCnt()); 
	}
}
