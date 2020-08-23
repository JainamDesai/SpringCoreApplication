package com.Springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	public Employee(String empName, List<String> phone, Set<String> address, Map<String, String> cource) {
		super();
		this.empName = empName;
		this.phone = phone;
		this.address = address;
		this.cource = cource;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String empName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCource() {
		return cource;
	}
	public void setCource(Map<String, String> cource) {
		this.cource = cource;
	}
	private List<String> phone;
	private Set<String> address;
	private Map<String,String> cource;
	
	
	

}
