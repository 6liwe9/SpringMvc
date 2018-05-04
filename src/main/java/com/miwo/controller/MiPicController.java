package com.miwo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.miwo.model.Article;
import com.miwo.service.MiPicService;
import com.miwo.utils.Result;

@Controller
@RequestMapping("/mipic")
public final class MiPicController {
	@Autowired
	MiPicService miPicService;
	@RequestMapping(value = "savePic.do", method = RequestMethod.POST)
	@ResponseBody
	public Result addMiPic(Article article,@RequestParam("pics") List<String> picIds,String userId,String type)  {
		if(miPicService.saveMiPic(picIds, userId,type))
			return Result.buildSuccessReslut(null);
		else
			return Result.buildFailReslut(null);
	}
	@RequestMapping(value = "valueMiPic.do", method = RequestMethod.POST)
	@ResponseBody
	public Result valueMiPic(String picId,Long hate,Long like)  {
		if(miPicService.valuePic(picId,hate,like))
			return Result.buildSuccessReslut(null);
		else
			return Result.buildFailReslut(null);
	}
	@RequestMapping(value = "getRandomPics.do", method = RequestMethod.POST)
	@ResponseBody
	public Result getRandomMiPic(String type,int cnt)  {
		return Result.buildSuccessReslut(miPicService.getMiPic(type,cnt));
	}
}
