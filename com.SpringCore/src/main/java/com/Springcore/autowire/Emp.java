package com.Springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", lastname=" + lastname + ", add=" + add.getCity() + "]";
	}
	public Emp() {
		super();
		
	}
	private String name;
	public Emp(String name, String lastname, Address add) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.add = add;
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
	public Address getAdd() {
		System.out.println("address is on");
		return add;
	}
	public void setAdd(Address add) {
		System.out.println("this is my address");
		this.add = add;
	}
	private String lastname;
	@Autowired
	@Qualifier("add2")
	private Address add;
	
	

}
