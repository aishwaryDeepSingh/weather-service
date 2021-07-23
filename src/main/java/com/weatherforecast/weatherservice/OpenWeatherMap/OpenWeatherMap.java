package com.weatherforecast.weatherservice.OpenWeatherMap;

import java.io.IOException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Service
public class OpenWeatherMap {
 
	static OkHttpClient client = new OkHttpClient();
	
	@Autowired
	Environment env;
	
	@Value("${openWeatherMap.appid}")
	String appid;
	
	public JSONObject weatherForecast(int zipcode) {  
		System.out.println(appid);
		     	   Request request = new Request.Builder()
				  .url("https://api.openweathermap.org/data/2.5/forecast?zip="+zipcode+"&appid="+appid+"")
				  .get()
				  .build();		
				Response response;
				try {
					response = client.newCall(request).execute();
					if(response.isSuccessful())
					{
						String str= response.body().string();
						JSONObject jsonObj=new JSONObject(str);
						System.out.println(str);
						return jsonObj;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}		
				return null;	
				
	}
	
}
