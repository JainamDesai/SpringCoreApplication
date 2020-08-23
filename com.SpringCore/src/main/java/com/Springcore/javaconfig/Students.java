package com.Springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Students {
	@Value("jainam shah")
	private String name;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
