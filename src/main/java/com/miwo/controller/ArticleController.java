package com.miwo.controller;


import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.miwo.model.Article;
import com.miwo.model.User;
import com.miwo.service.ArticleService;
import com.miwo.service.InheritService;
import com.miwo.service.PicService;
import com.miwo.service.UserService;
import com.miwo.utils.Result;
import com.miwo.vo.InheritCalculateVo;
import com.miwo.vo.InheritVo;

@Controller
@RequestMapping("/article")
public final class ArticleController {
	@Autowired
	PicService picService;
	@Autowired
	ArticleService articleSercvice;
	@RequestMapping(value = "upload.action", method = RequestMethod.POST)
	@ResponseBody
	public Result addArticle(HttpServletRequest request, @RequestParam("article") Article article,
			@RequestParam("pics") List<MultipartFile> picList)  {
		String  url=request.getScheme()+"://"+request.getServerName();
		List<Long> ids= picService.savePic(picList,url);
		articleSercvice.saveArticle(ids, article);

		return null;
	}
}
