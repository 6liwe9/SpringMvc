package com.miwo.utils;

/**
 * @author liwez
 * 统一下 返回的格式
 * {
 * 		result:"success",
 *      data:{?}
 * }
 */
public class Result {
	private String result;
	private Object data;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static Result buildSuccessReslut(Object data) { 
		Result ret=new Result();
		ret.setResult("success");
		ret.setData(data);
		return ret;
	}
	public static Result buildFailReslut(Object data) { 
		Result ret=new Result();
		ret.setResult("fail");
		ret.setData(data);
		return ret;
	}
}
