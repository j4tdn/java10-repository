package service;

import java.sql.Date;
import java.util.List;

import dao.ItemDao;
import persistence.Item;


public class ItemService {
	private ItemDao itemDao;

	public ItemService() {
		itemDao = new ItemDao();
	}

	public List<Item> getItem(int id) {
		return itemDao.getItemfor(id) ;
	}
	
	public List<Item> getItemByDate(Date date) {
		return itemDao.getItemByDate(date);
	}
	 public List<Item> getItemsProcedure(int itemGroupId) {
		 return itemDao.getItemsProcedure(itemGroupId);
	}
}


