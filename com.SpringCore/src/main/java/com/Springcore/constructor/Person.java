package com.Springcore.constructor;

public class Person {
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", location=" + location + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String location;

}
