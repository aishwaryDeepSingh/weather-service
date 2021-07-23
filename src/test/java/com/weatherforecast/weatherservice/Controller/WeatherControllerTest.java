package com.weatherforecast.weatherservice.Controller;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.weatherforecast.weatherservice.API.weatherAPIService;


@WebMvcTest(value=WeatherController.class)
@RunWith(SpringRunner.class)
class WeatherControllerTest {

	@Autowired
	private MockMvc mockmvc;
	
	@MockBean
	private weatherAPIService weatherAPI;
	
	@Test
	void testGetWeatherByZipCode() throws Exception {
		
		Mockito.when(weatherAPI.getWeatherByZipcode(Mockito.anyInt())).thenReturn("2021-07-23 12:00:00");
		
		String URI = "/weather-by-zipcode/90011";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				URI);

		MvcResult result = mockmvc.perform(requestBuilder).andReturn();
		String expectedString = "2021-07-23 12:00:00";
		String outputString = result.getResponse().getContentAsString();
		assertEquals(outputString , expectedString);

	}

}
