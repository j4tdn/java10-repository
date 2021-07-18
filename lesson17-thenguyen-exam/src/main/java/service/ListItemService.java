package service;

import java.util.List;

import dao.ItemDao;
import dao.ListItemDao;
import persistence.Items;
import persistence.ListItems;

public class ListItemService {
	private ListItemDao listItemDao;

	public ListItemService() {
		listItemDao = new ListItemDao();
	}

	public List<ListItems> getListItems() {
		return listItemDao.getListItems();
	}
}
