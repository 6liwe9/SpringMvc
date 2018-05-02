package com.miwo.utils;

import java.util.Random;

/**
 * @author liwez
 * 生成id 目前拿时间戳，访问量大了 会有重复，以后换一个
 */
public class IDGenerator {
	public static Long getid() {
		Long id= new Random(System.currentTimeMillis()).nextLong();
		return id>0?id:-id;
	}
}
