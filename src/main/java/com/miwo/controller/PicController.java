package com.miwo.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.miwo.service.PicService;
import com.miwo.utils.Result;

@Controller
@RequestMapping("/pic")
public final class PicController {
	@Autowired
	PicService picService;
	@RequestMapping(value = "uploadPic.do", method = RequestMethod.POST)
	@ResponseBody
	public Result addArticle(HttpServletRequest request,
			@RequestParam("pic") MultipartFile pic)  {
		String  url=request.getScheme()+"://"+request.getServerName();
		Long id= picService.savePic(pic,url);
		if(id!=-1) {
			return Result.buildSuccessReslut(id+"");
		}else
			return Result.buildFailReslut(null);
		
	}
}
