package com.weatherforecast.weatherservice.Bean;

import java.util.ArrayList;

public class OpenWeatherResponse {

	public String cod;
    public int message;
    public int cnt;
    public ArrayList<List> list;
    public City city;
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public ArrayList<List> getList() {
		return list;
	}
	public void setList(ArrayList<List> list) {
		this.list = list;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "OpenWeatherResponse [cod=" + cod + ", message=" + message + ", cnt=" + cnt + ", list=" + list
				+ ", city=" + city + "]";
	}
    
    
}
