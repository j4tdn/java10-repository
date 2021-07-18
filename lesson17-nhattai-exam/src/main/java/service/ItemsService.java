package service;

import java.sql.Date;
import java.util.List;

import dao.ItemsDao;
import persistence.Items;

public class ItemsService {
	private ItemsDao itemsDao;

	public ItemsService() {
		itemsDao = new ItemsDao();
	}

	public List<Items> getItems(Date orderTime) {
		return itemsDao.getItems(orderTime);
	}

	public List<String> getTop3Item(Integer year) {
		return itemsDao.getTop3Item(year);
	}
}
