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
	public Result valueMiPic(String picId,Boolean like)  {
		if(miPicService.valuePic(picId,like))
			return Result.buildSuccessReslut(null);
		else
			return Result.buildFailReslut(null);
	}
	@RequestMapping(value = "getRandomPics.do", method = RequestMethod.POST)
	@ResponseBody
	public Result getRandomMiPic(String type,int cnt)  {
		return Result.buildSuccessReslut(miPicService.getMiPic(type,cnt));
	}
	@RequestMapping(value = "getPics.do", method = RequestMethod.POST)
	@ResponseBody
	public Result getMiPicByPage(String type,int page,int size)  {
		return Result.buildSuccessReslut(miPicService.getMiPicByPage(type,page,size));
	}
	@RequestMapping(value = "getYesterdayPics.do", method = RequestMethod.POST)
	@ResponseBody
	public Result getYesterdayMiPic(int page,int size)  {
		return Result.buildSuccessReslut(miPicService.getYesterdayMiPic(page,size));
	}
	@RequestMapping(value = "getPicsByUser.do", method = RequestMethod.POST)
	@ResponseBody
	public Result getMiPicByUser(String userId)  {
		return Result.buildSuccessReslut(miPicService.getMiPicByUser(userId));
	}
	@RequestMapping(value = "delPics.do", method = RequestMethod.POST)
	@ResponseBody
	public Result delPic(String picId)  {
		if(miPicService.delPic(picId))
			return Result.buildSuccessReslut(null);
		return Result.buildFailReslut(null);
	}
}
