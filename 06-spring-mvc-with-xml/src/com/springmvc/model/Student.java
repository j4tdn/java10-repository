package com.springmvc.model;

public class Student {
	private String fullname;
	private String age;
	private String country;
	private String language;
	private String[] systems;
	
	public Student() {
	}

	public Student(String fullname, String age) {
		this.fullname = fullname;
		this.age = age;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String[] getSystems() {
		return systems;
	}
	
	public void setSystems(String[] systems) {
		this.systems = systems;
	}
}
