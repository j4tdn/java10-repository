package com.spring.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.MovieService;

public class App {
	
	private static final String PATH = "aop-third.xml";
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(PATH);
		
		// Get bean proxy and return joinpoint type at runtime
		// MovieService service = context.getBean("movieServiceProxy", MovieService.class);
		
		// Auto proxy
		MovieService service = context.getBean("movieService", MovieService.class);
		service.printName();
		service.printCatalog();
		
		context.close();
	}
}
