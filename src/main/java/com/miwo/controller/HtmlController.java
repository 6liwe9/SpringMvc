package com.miwo.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.miwo.model.Article;
import com.miwo.service.AnnounceService;
import com.miwo.service.ArticleService;
import com.miwo.service.PicService;
import com.miwo.service.SaleService;
import com.miwo.utils.Result;

@Controller
@RequestMapping("/html")
public final class HtmlController {
	@Autowired
	ArticleService articleService;
	@Autowired
	AnnounceService announceService;
	@Autowired
	PicService picService;
	@Autowired
	SaleService saleService;
	@RequestMapping(value = "addAnnounce.do", method = RequestMethod.POST)
	@ResponseBody
	public Result addAnnounce(HttpServletRequest request,@RequestParam("file") List<MultipartFile> fileList,String announceText ,String content,String title)  {
		String  url=request.getScheme()+"://"+request.getServerName();
		List<String> pids=new ArrayList<String>();
		for(MultipartFile file:fileList) {
			Long pid=picService.savePic(file, url);
			if(pid!=-1)
				pids.add(pid.toString());
		}
		if(pids.size()!=0) {
			Article article=new Article();
			article.setArticleContent(content);
			article.setArticleTitle(title);
			Long aid=articleService.saveArticle(pids, article);
			if(aid!=-1) {
				if(announceService.saveAnnounce(new Long(pids.get(0)),aid,announceText)) {
					return Result.buildSuccessReslut(null);
				}
			}
		}
		return Result.buildFailReslut(null);
	}
	
	@RequestMapping(value = "addSale.do", method = RequestMethod.POST)
	@ResponseBody
	public Result addSale(HttpServletRequest request,@RequestParam("file") List<MultipartFile> fileList,String content,String title)  {
		String  url=request.getScheme()+"://"+request.getServerName();
		List<String> pids=new ArrayList<String>();
		for(MultipartFile file:fileList) {
			Long pid=picService.savePic(file, url);
			if(pid!=-1)
				pids.add(pid.toString());
		}
		if(pids.size()!=0) {
			Article article=new Article();
			article.setArticleContent(content);
			article.setArticleTitle(title);
			Long aid=articleService.saveArticle(pids, article);
			if(aid!=-1) {
				if(saleService.insertSale(aid)) {
					return Result.buildSuccessReslut(null);
				}
			}
		}
		return Result.buildFailReslut(null);
	}
	
}
