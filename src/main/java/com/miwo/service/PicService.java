package com.miwo.service;

import java.io.File;
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
	public List<Long> savePic(List<MultipartFile> picList, String url) {
		List<Long> ret=new ArrayList<Long>();
		for (MultipartFile file : picList) {
			// 如果文件不为空，写入上传路径
			if (!file.isEmpty()) {
			try {
				// 上传文件名
				String filename = file.getOriginalFilename();
				File filepath = new File(path, filename);
				// 判断路径是否存在，如果不存在就创建一个
				if (!filepath.getParentFile().exists()) {
					filepath.getParentFile().mkdirs();
				}
				// 将上传文件保存到一个目标文件当中
				String picPath=path + File.separator + filename;
				file.transferTo(new File(picPath));
				Pic pic=new Pic();
				Long picId=IDGenerator.getid();
				pic.setPicId(picId);
				pic.setAddTime(new Date());
				pic.setPicPath(path);
				pic.setPicName(filename);
				pic.setPicUrl(url+File.separator+urlPrefix+File.separator+filename);
				if(picMapper.insert(pic)==1) {
					ret.add(picId);
				}
				}catch(Exception e) {
					
				}
			}
		}
		return ret;
	}
	
}
