package com.weatherforecast.weatherservice.API;

import java.util.Collections;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.weatherforecast.weatherservice.Bean.List;
import com.weatherforecast.weatherservice.Bean.OpenWeatherResponse;
import com.weatherforecast.weatherservice.OpenWeatherMap.OpenWeatherMap;

@Service
public class WeatherAPIManager implements weatherAPIService {

	@Autowired
	OpenWeatherMap weatherMap;
	
	DateTime now = new DateTime();
	
	@Override
	public String getWeatherByZipcode(int zipcode){
		try {
			
			JSONObject json =  weatherMap.weatherForecast(zipcode);
			if(json != null) {
				OpenWeatherResponse response = new Gson().fromJson(json.toString(), OpenWeatherResponse.class);
				System.out.println(response);
				Collections.sort(response.getList());
				  for( List obj : response.getList()){
					 DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-mm-dd HH:mm:ss");
				     DateTime dt = formatter.parseDateTime(obj.dt_txt);
				     if(dt.getDayOfMonth() ==  now.getDayOfMonth()+1) {
					  return obj.dt_txt; 
					} 
				   }
			}else {
				return "City not found";
			}
			
			 
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return null;
	}

}
