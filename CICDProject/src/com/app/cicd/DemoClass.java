package com.app.cicd;

public class DemoClass {
	
	private String name;
	private double age;
	
	public DemoClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "DemoClass [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
