package com.miwo.utils;

/**
 * @author liwez
 * 生成id 目前拿时间戳，访问量大了 会有重复，以后换一个
 */
public class IDGenerator {
	public synchronized static Long getid() {
		return System.currentTimeMillis();
	}
}
