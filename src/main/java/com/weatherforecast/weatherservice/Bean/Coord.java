package com.weatherforecast.weatherservice.Bean;

public class Coord {

	 @Override
	public String toString() {
		return "Coord [lat=" + lat + ", lon=" + lon + "]";
	}
	public double lat;
	    public double lon;
		public double getLat() {
			return lat;
		}
		public void setLat(double lat) {
			this.lat = lat;
		}
		public double getLon() {
			return lon;
		}
		public void setLon(double lon) {
			this.lon = lon;
		}
	    
	    
}
