package service;

import java.sql.Date;
import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.Items;
import persistence.ListItem;

public class ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroup> itemGroups(Date date) {
		return itemGroupDao.getItemToDay(date);
	}

	public List<Items> getItems() {
		return itemGroupDao.getItems();
	}
	
	public List<ListItem> getListItem() {
		return itemGroupDao.getListItem();
	}
	
	public List<String> getItem() {
		return itemGroupDao.getItem();
	}
}
