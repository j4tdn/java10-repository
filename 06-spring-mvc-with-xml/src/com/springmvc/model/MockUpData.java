package com.springmvc.model;

public class MockUpData {
	private MockUpData() {
		
	}
	
	public static String[] countries() {
		return new String[] {"Brazil", "France", "Germany", "India"};
	}
	
	public static String[] languages() {
		return new String[] {"Swing Desktop App", "Spring MVC WebApp", "Spring Boot", "JPA/Hibernate"};
	}
	
	public static String[] os() {
		return new String[] {"Windows", "Mac OS", "Linux", "Unix"};
	}
}
