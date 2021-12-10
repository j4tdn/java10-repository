package com.spring.demo;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext ClassPathResource >> .classPath >> target/classes
		// default prefix: "classpath:"
		
		String path = "configure/spring-beans.xml";
		
		// add prefix
		path = "classpath:configure/spring-beans.xml";
		
		// ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		// FileSystemXmlApplicationContext >> FileSystemResource
		// default prefix: "file:///"
		// read files from project system file
		// customer >> prefix
		
		path = "spring-beans.xml";
		
		// ConfigurableApplicationContext context = new FileSystemXmlApplicationContext(path);
		
		path = "spring-beans.xml";
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(path, App.class);
		
		String[] beans = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
		
		context.close();
	}
}
