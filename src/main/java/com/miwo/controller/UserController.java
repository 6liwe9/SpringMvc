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
		return Result.buildSuccessReslut(userService.login(user)); 
	}
	@RequestMapping(value = "user_get.do", method = RequestMethod.GET)
	@ResponseBody
	public Result getUser(long userId){
		User user=userService.getUser(userId);
		if(user==null) {
			return Result.buildFailReslut(null);
		}else
			return Result.buildSuccessReslut(user);

	}

}
