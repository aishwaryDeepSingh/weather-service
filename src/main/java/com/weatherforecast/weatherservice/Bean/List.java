package com.weatherforecast.weatherservice.Bean;

import java.util.ArrayList;

public class List implements Comparable<List>{

		public int dt;
	    public Main main;
	    public ArrayList<Weather> weather;
	    public Clouds clouds;
	    public Wind wind;
	    public int visibility;
	    public double pop;
	    public Sys sys;
	    public String dt_txt;
		public int getDt() {
			return dt;
		}
		public void setDt(int dt) {
			this.dt = dt;
		}
		public Main getMain() {
			return main;
		}
		public void setMain(Main main) {
			this.main = main;
		}
		public ArrayList<Weather> getWeather() {
			return weather;
		}
		public void setWeather(ArrayList<Weather> weather) {
			this.weather = weather;
		}
		public Clouds getClouds() {
			return clouds;
		}
		public void setClouds(Clouds clouds) {
			this.clouds = clouds;
		}
		public Wind getWind() {
			return wind;
		}
		public void setWind(Wind wind) {
			this.wind = wind;
		}
		public int getVisibility() {
			return visibility;
		}
		public void setVisibility(int visibility) {
			this.visibility = visibility;
		}
		public double getPop() {
			return pop;
		}
		public void setPop(double pop) {
			this.pop = pop;
		}
		public Sys getSys() {
			return sys;
		}
		public void setSys(Sys sys) {
			this.sys = sys;
		}
		public String getDt_txt() {
			return dt_txt;
		}
		public void setDt_txt(String dt_txt) {
			this.dt_txt = dt_txt;
		}
	    
		@Override
		public String toString() {
			return "List [dt=" + dt + ", main=" + main + ", weather=" + weather + ", clouds=" + clouds + ", wind=" + wind
					+ ", visibility=" + visibility + ", pop=" + pop + ", sys=" + sys + ", dt_txt=" + dt_txt + "]";
		}
		@Override
		public int compareTo(List o) {
			
			return (this.getMain().getTemp() < o.getMain().getTemp())? -1 : 1;
		}
		
		
}
