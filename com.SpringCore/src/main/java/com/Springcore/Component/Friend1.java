package com.Springcore.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Friend1 {
	@Value("jainamdesai")
	private String name;
	public Friend1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Friend1 [name=" + name + ", lastname=" + lastname + ", location=" + location + "]";
	}
	public Friend1(String name, String lastname, String location) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Value("desai")
	private String lastname;
	@Value("mumbai")
	private String location;

}
