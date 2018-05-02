package com.miwo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miwo.model.Article;
import com.miwo.service.ArticleService;
import com.miwo.service.PicService;
import com.miwo.utils.Result;

@Controller
@RequestMapping("/article")
public final class ArticleController {
	@Autowired
	ArticleService articleService;
	@RequestMapping(value = "addTakeArticle.do", method = RequestMethod.POST)
	@ResponseBody
	public Result addArticle(Article article,@RequestParam("pics") List<String> picIds)  {
		return Result.buildSuccessReslut(articleService.saveArticle(picIds, article)+"");
		
	}
	@RequestMapping(value = "getArticle.do", method = RequestMethod.GET)
	@ResponseBody
	public Result getArticle(@RequestParam("articleId") String articleId)  {
		return Result.buildSuccessReslut(articleService.getArticle(new Long(articleId)));
		
	}
}
