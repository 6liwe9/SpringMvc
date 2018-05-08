package com.miwo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.miwo.service.MapService;
import com.miwo.utils.Result;

@Controller
@RequestMapping("/map")
public final class MapController {
	@Autowired
	MapService mapService;
	@RequestMapping(value = "addUserPosition.do", method = RequestMethod.POST)
	@ResponseBody
	public Result addPosition(String userId,Double latitude,Double longitude)  {
		if(!mapService.updateUser(new Long(userId), latitude, longitude))
			return Result.buildFailReslut("位置共享失败！！！");
		else {
			return Result.buildSuccessReslut(mapService.getUsers());
		}		
	}
	
}
