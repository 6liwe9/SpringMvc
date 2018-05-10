package com.miwo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.miwo.model.User;
import com.miwo.service.UserService;
import com.miwo.utils.Result;

@Controller
@RequestMapping("/user")
public final class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value="user_login.do",method= RequestMethod.POST)
	@ResponseBody
	public  Result userLogin(User user)  {
		Long uId=userService.login(user);
		if(uId!=null)
			return Result.buildSuccessReslut(uId.toString());
		else
			return Result.buildFailReslut(null);
	}
	@RequestMapping(value="code2id.do",method= RequestMethod.GET)
	@ResponseBody
	public  Result code2id(String js_code,String appid,String secret,String grant_type)  {
		Object openid=userService.code2id(js_code,appid,secret,grant_type);
		if(openid!=null) {
			return Result.buildSuccessReslut(openid.toString());
		}else {
			return Result.buildFailReslut(null);
		}
	}
	@RequestMapping(value = "user_get.do", method = RequestMethod.GET)
	@ResponseBody
	public Result getUser(String userId){
		User user=userService.getUser(new Long(userId));
		if(user==null) {
			return Result.buildFailReslut(null);
		}else
			return Result.buildSuccessReslut(user);

	}
	@RequestMapping(value = "user_update.do", method = RequestMethod.POST)
	@ResponseBody
	public Result updateUser(User user){
	
		if(!userService.updateUser(user)) {
			return Result.buildFailReslut(null);
		}else
			return Result.buildSuccessReslut(null);

	}

}
