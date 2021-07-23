package com.weatherforecast.weatherservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weatherforecast.weatherservice.API.weatherAPIService;


@RestController
public class WeatherController {

	@Autowired weatherAPIService api;
	
	@GetMapping("weather-by-zipcode/{zipcode}")
	public String getWeatherByZipCode(@PathVariable int zipcode) {	
		if(zipcode != 0) {
			String response = api.getWeatherByZipcode(zipcode); 
			return response;
		}
		return "No ZipCode found";
	}
}
