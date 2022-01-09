package com.spring.demo;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Item;
import com.spring.service.ClientService;
import com.spring.service.ItemService;

public class App {
	public static void main(String[] args) {
		// B1: Item class - Plain Object
		// B2: Configuration Metadata - Defined bean and dependencies
		// B3: Construct Spring IOC Container from configuration file
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		String[] beans = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
		
		System.out.println("/////////////// --- IOC DI --- ////////////////");
		Item itemA = context.getBean("itemA", Item.class);
		Item itemB = context.getBean("itemB", Item.class);
		Item itemC = context.getBean("itemC", Item.class);
		
		System.out.println(itemA);
		System.out.println(itemB);
		System.out.println(itemC);
		
		System.out.println("/////////////// --- Bean Overview --- ////////////////");
		ClientService clientService = context.getBean("clientService", ClientService.class);
		clientService.clientInfo();
		
		System.out.println("/////////////// --- Bean Scope LifeCycle --- ////////////////");
		ItemService serviceA = context.getBean("itemService", ItemService.class);
		ItemService serviceB = context.getBean("itemService", ItemService.class);
		
		// single, prototype
		System.out.println("serviceA: " + serviceA);
		System.out.println("serviceB: " + serviceB);
		
		context.close();
	}
}
