package demo;

import service.ItemGroupService;
import service.impl.ItemGroupServiceImpl;

public class HibernateItemGroupDemo {
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
//		itemGroupService.getAllHql().forEach(System.out::println);
		
//		System.out.println(itemGroupService.get(2));
		
		itemGroupService.getItemGroupDtos().forEach(System.out::println);
		
	}
}
