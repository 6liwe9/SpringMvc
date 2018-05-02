package com.miwo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miwo.dao.ArticleMapper;
import com.miwo.dao.ArticlePicMapper;
import com.miwo.dao.PicMapper;
import com.miwo.model.Article;
import com.miwo.model.ArticlePic;
import com.miwo.model.ArticlePicExample;
import com.miwo.model.Pic;
import com.miwo.utils.IDGenerator;


@Service
public class ArticleService {
	@Autowired
	ArticleMapper articleMapper;
	@Autowired
	ArticlePicMapper articlePicMapper;
	@Autowired
	PicMapper picMapper;
	public Long saveArticle(List<String>pics,Article article) {
		Long id=IDGenerator.getid();
		article.setArticleId(id);
		if(articleMapper.insert(article)==1) {
			ArticlePic articlePic=new ArticlePic();
			for(String pid:pics) {
				articlePic.setArticleId(id);
				articlePic.setPicId(new Long(pid));
				articlePicMapper.insert(articlePic);
			}
			return id;
		}
		return -1l;
	}
	public Map getArticle(Long articleId) {
		// TODO Auto-generated method stub
		Article article =articleMapper.selectByPrimaryKey(articleId);
		if(article!=null) {
			Map<String,Object> ret=new HashMap<String,Object>();
			ret.put("articleTitle", article.getArticleTitle());
			ret.put("articleContent", article.getArticleContent());
			ArticlePicExample example=new ArticlePicExample();
			example.createCriteria().andArticleIdEqualTo(articleId);
			List<ArticlePic> pics=articlePicMapper.selectByExample(example);
			ArrayList<String> picList=new ArrayList<String>();
			for(ArticlePic ap:pics) {
				Pic pic=picMapper.selectByPrimaryKey(ap.getPicId());
				if(pic!=null) {
					picList.add(pic.getPicUrl());
				}
			}
			ret.put("pics", picList);
			return ret;
		}else 
			return null;
	}
	
}
