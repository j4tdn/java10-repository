package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

	@Autowired
	// @Qualifier("movieAction") >> using @Primary
	private MovieCatalog movieCatalog;
	
	public void recommend() {
		System.out.println("TYPE: " + movieCatalog.getCatalog());
		movieCatalog.showMovie();
	}
	
}
