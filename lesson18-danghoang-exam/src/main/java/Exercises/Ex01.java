package view;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.Properties;

import connection.DbConnection;
import connection.DbProvider;

import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

import service.ItemGroupService;
import service.ItemService;


public class Ex01 {

	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupService();
	}
	
	private static ItemService itemService;
	static {
		itemService = new ItemService();
	}
	
	
	
	public static void main(String[] args) {

		Connection connection = DbConnection.getConnection();
		System.out.println(connection);

		List<ItemGroup> itemGrpAll = itemGroupService.getAll();
		show(itemGrpAll);
		System.out.println("=============");
		
				
		List<ItemGroupDto> itemByAmount = itemGroupService.getItemGroups();
		show(itemByAmount);
	
				
	    
		List<Item> itemByDate = itemService.getItemByDate(Date.valueOf("2020-12-18"));
		show(itemByDate);
		System.out.println("=============");
		
		List<Item> get = itemService.get();
		show(itemByDate);
		System.out.println("=============");
		
		
	}

	private static <E> void show(List<E> es) {
		for (E e : es) {
			System.out.println(e);
		}
	}
}