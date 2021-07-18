package service;

import java.util.List;

import dao.ListItemsDao;
import persistence.ListItems;

public class ListItemsService {
	private ListItemsDao listItemsDao;

	public ListItemsService() {
		listItemsDao = new ListItemsDao();
	}

	public List<ListItems> getListItems() {
		return listItemsDao.getListItems();
	}
}
