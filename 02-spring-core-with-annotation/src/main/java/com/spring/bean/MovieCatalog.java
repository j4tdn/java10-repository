package com.spring.bean;

public class MovieCatalog {

	private final String catalog;

	public MovieCatalog(String catalog) {
		this.catalog = catalog;
	}
	
	public String getCatalog() {
		return catalog;
	}

	public void showMovie() {
		switch (catalog) {
		case "Action":
			System.out.println("Hot Movie 01 >> Foreover >> Action ...");
			break;
		case "Adventure":
			System.out.println("Hot Movie 02 >> Avatar >> Adventure ...");
			break;
		}
	}

}
