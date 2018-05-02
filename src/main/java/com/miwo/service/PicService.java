package com.miwo.service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.miwo.dao.PicMapper;
import com.miwo.model.Pic;
import com.miwo.utils.IDGenerator;


@Service
public class PicService {
	@Value("#{properties['pic.path']}")
	String path;
	@Value("#{properties['pic.prefix']}")
	String urlPrefix;
	@Autowired
	PicMapper picMapper;
	public Long savePic(MultipartFile file, String url) {
			// 如果文件不为空，写入上传路径
			if (!file.isEmpty()) {
			try {
				// 上传文件名
				Date now=new Date();
				String originalName=file.getOriginalFilename();
				String filename = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(now)+originalName.substring(originalName.lastIndexOf('.'));
				String subPath=new SimpleDateFormat("yyyyMMdd").format(now);
				File filepath = new File(path+File.separator+subPath, filename);
				// 判断路径是否存在，如果不存在就创建一个
				if (!filepath.getParentFile().exists()) {
					filepath.getParentFile().mkdirs();
				}
				// 将上传文件保存到一个目标文件当中
				String picPath=path+File.separator+subPath +File.separator+ filename;
				file.transferTo(new File(picPath));
				Pic pic=new Pic();
				Long picId=IDGenerator.getid();
				pic.setPicId(picId);
				pic.setAddTime(new Date());
				pic.setPicPath(path);
				pic.setPicName(filename);
				pic.setPicUrl(url+'/'+urlPrefix+'/'+subPath+'/'+filename);
				if(picMapper.insert(pic)==1) {
					return picId;
				}
				}catch(Exception e) {
					return -1l;
				}
			}
			return -1l;
	
	}
	
}
