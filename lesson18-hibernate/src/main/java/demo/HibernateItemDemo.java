package demo;

import service.ItemService;
import service.impl.ItemServiceImpl;

public class HibernateItemDemo {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		itemService.getAll().forEach(System.out::println);
		
		System.out.println(itemService.get(2));
	}
}
