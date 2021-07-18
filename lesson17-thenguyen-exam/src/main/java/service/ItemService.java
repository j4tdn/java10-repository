package service;
import java.util.List;

import dao.ItemDao;
import persistence.Items;
import persistence.Items2;

public class ItemService {
	private ItemDao itemDao;

	public ItemService() {
		itemDao = new ItemDao();
	}

	public List<Items> getItems() {
		return itemDao.getItems();
	}
	public List<Items2> getItems2() {
		return itemDao.getItems2();
	}
}
