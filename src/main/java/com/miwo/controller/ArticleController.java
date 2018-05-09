package com.miwo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miwo.model.Article;
import com.miwo.service.AnnounceService;
import com.miwo.service.ArticleService;
import com.miwo.service.PicService;
import com.miwo.service.SaleService;
import com.miwo.service.TakeawayService;
import com.miwo.utils.Result;

@Controller
@RequestMapping("/article")
public final class ArticleController {
	@Autowired
	ArticleService articleService;
	@Autowired
	TakeawayService takeawayService;
	@Autowired
	SaleService saleService;
	@Autowired
    AnnounceService announceService;
	
	@RequestMapping(value = "addTakeArticle.do", method = RequestMethod.POST)
	@ResponseBody
	public Result addArticle(Article article,@RequestParam("pics") List<String> picIds,String userId,String type)  {
		Long articleId=articleService.saveArticle(picIds, article);
		if(articleId!=-1&&takeawayService.insertTakeAway(articleId,new Long(userId), type))
			return Result.buildSuccessReslut(articleId+"");
		else
			return Result.buildFailReslut(null);
		
		
	}
	@RequestMapping(value = "getAnnounce.do", method = RequestMethod.GET)
	@ResponseBody
	public Result getAnnounce()  {
			return Result.buildSuccessReslut(announceService.getAnnounce());
	}
	@RequestMapping(value = "getArticle.do", method = RequestMethod.GET)
	@ResponseBody
	public Result getArticle(@RequestParam("articleId") String articleId)  {
		return Result.buildSuccessReslut(articleService.getArticle(new Long(articleId)));
		
	}
	@RequestMapping(value = "getTakeArticle.do", method = RequestMethod.POST)
	@ResponseBody
	public Result getTakeArticle(String type,String userId,Integer page,Integer size)  {
		List<Long> articleIds=takeawayService.getTakeAway(userId, type, page, size);
		return Result.buildSuccessReslut(articleService.getArticles(articleIds));
		
	}
	@RequestMapping(value = "delTakeArticle.do", method = RequestMethod.GET)
	@ResponseBody
	public Result delTakeArticle(String articleId)  {
		if(!articleService.delArticle(new Long(articleId)))
			return Result.buildFailReslut(null);
		else
			if(takeawayService.delTakeAway(new Long(articleId))) {
				return Result.buildSuccessReslut(null);
			}else
				return Result.buildFailReslut(null);
		
		
	}
	@RequestMapping(value = "getSaleArticle.do", method = RequestMethod.GET)
	@ResponseBody
	public Result getSaleArticle()  {
		List<Long> articleIds=saleService.getSaleItem();
		return Result.buildSuccessReslut(articleService.getSaleArticles(articleIds));
		
	}
}
