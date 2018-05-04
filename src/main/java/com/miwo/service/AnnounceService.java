package com.miwo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miwo.dao.AnnouncementMapper;
import com.miwo.dao.PicMapper;
import com.miwo.model.Announcement;
import com.miwo.model.AnnouncementExample;
import com.miwo.model.Pic;


@Service
public class AnnounceService {
	@Autowired
	AnnouncementMapper announceMapper;
	@Autowired
	ArticleService articleService;
	@Autowired
	PicMapper picMapper;
	public boolean saveAnnounce(Long cover, Long articleId, String announceText) {
		// TODO Auto-generated method stub
		Announcement announce=new Announcement();
		announce.setAnnounceCover(cover);
		announce.setAnnounceText(announceText);
		announce.setArticleId(articleId);
		return announceMapper.insert(announce)==1;
	}
	public List getAnnounce() {
		AnnouncementExample example=new AnnouncementExample() ;
		// TODO Auto-generated method stub
		List<Object> ret=new ArrayList<Object>();
		List<Announcement> ans=announceMapper.selectByExample(example);
		for(Announcement a:ans) {
			Pic pic=picMapper.selectByPrimaryKey(a.getAnnounceCover());
			if(pic!=null) {
				Map<String,Object> announce=new HashMap<String,Object>();
				announce.put("text", a.getAnnounceText());
				announce.put("cover", pic.getPicUrl());
				announce.put("articleid", a.getArticleId().toString());
				ret.add(announce);
			}
		}
		return ret;
	}
	public Boolean deleteAnnounce() {
		// TODO Auto-generated method stub
		AnnouncementExample example=new AnnouncementExample() ;
		List<Announcement> tmp=announceMapper.selectByExample(example);
		for(Announcement announce:tmp) {
			if(!articleService.delArticle(announce.getArticleId()))
				return false;
		}
		return announceMapper.deleteByExample(example)==tmp.size();
	}
}
