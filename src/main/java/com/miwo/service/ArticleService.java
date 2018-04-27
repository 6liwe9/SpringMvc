package com.miwo.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.miwo.dao.ArticleMapper;
import com.miwo.dao.ArticlePicMapper;
import com.miwo.dao.PicMapper;
import com.miwo.model.Article;
import com.miwo.model.Pic;
import com.miwo.utils.IDGenerator;


@Service
public class ArticleService {
	@Autowired
	ArticleMapper articleMapper;
	ArticlePicMapper articlePicMapper;
	public boolean saveArticle(List<Long>pics,Article article) {
		return false;
	}
	
}
