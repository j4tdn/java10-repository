package demo;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.HibernateUtils;

public class App {
	
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		List<ItemGroup> elements = itemGroupService.getAll();
		elements.forEach(System.out::println);
		
//	    ItemGroup igr = itemGroupService.get(1);
//		System.out.println(igr);
		
	}
	
}
