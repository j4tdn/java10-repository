package service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.Item;


public class ItemService {
	private static ItemDao itemDao;
	private static ItemGroupDao itemGroupDao;

	public ItemService() {
		itemDao = new ItemDao();
	}

	public static List<Item> getItemByDate(LocalDate date) {
		return itemDao.getItemByDate(date);
	}
	public List<String> get(String name) {
		return ItemGroupDao.get(name);
	}
	
	
}

