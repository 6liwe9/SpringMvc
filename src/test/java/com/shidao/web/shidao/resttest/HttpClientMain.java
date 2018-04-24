package com.shidao.web.shidao.resttest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class HttpClientMain {
	public static String httpGet(String url, Map<String, String> params) {
		HttpClient client = HttpClients.createDefault();
		StringBuilder sb = new StringBuilder(url);
		sb.append("?");
		boolean isFirst = true;
		for (Entry<String, String> entry : params.entrySet()) {
			if (isFirst) {
				sb.append(entry.getKey() + "=" + entry.getValue());
				isFirst = false;
			} else
				sb.append("&" + entry.getKey() + "=" + entry.getValue());

		}
		String result;
		try {
			HttpGet get = new HttpGet(sb.toString());
			HttpResponse response = client.execute(get);
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity, "UTF-8");
			return result;
		} catch (ParseException | IOException e) {
			// TODO Auto-generated catch block
			
			return "http client error"+e.getMessage();
		}
		
	}
	public static String httpPost(String url, Object param) {
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
        Gson gson=new Gson();
        post.setHeader("Content-type", "application/json; charset=utf-8");
        post.setHeader("Connection", "Close");
        StringEntity entity = new StringEntity(gson.toJson(param), Charset.forName("UTF-8"));
        entity.setContentEncoding("UTF-8");
        // 发送Json格式的数据请求
        entity.setContentType("application/json");
        post.setEntity(entity);
            
        try {
			HttpResponse response = httpClient.execute(post);
			 int code = response.getStatusLine().getStatusCode();  
	        
	            	BufferedReader  in = new BufferedReader(new InputStreamReader(response.getEntity()    
	                        .getContent(),"utf-8"));  
	                StringBuffer sb = new StringBuffer("");    
	                String line = "";    
	                String NL = System.getProperty("line.separator");    
	                while ((line = in.readLine()) != null) {    
	                    sb.append(line + NL);    
	                }  
	                  
	                in.close();    
	                return "返回"+code+":"+sb.toString();  
	       
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "httpclient error"+e.getMessage();
		}
		
	}
}
