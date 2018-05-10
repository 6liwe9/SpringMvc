package com.miwo.utils;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientMain {
	public static String httpGet(String url, Map<String, String> params) {
		
		HttpClient client= HttpClients.createDefault();
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
			
			return "";
		}
	}
	
}
