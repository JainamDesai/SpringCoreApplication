package com.Springcore.autowire;

public class Address {
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String country;
	

}
