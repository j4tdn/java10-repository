package service;

import java.sql.Date;
import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroup2;
import persistence.ItemGroup3;

public class ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroup> itemGroups(Date date) {
		return itemGroupDao.getItemToDay(date);

	}

	public List<ItemGroup2> itemGroup2s() {
		return itemGroupDao.getItems();
	}
	
	public List<String> strings(Integer year) {
		return itemGroupDao.getTop(year);
	}
	
	public List<ItemGroup3> itemGroup3s() {
		return itemGroupDao.Items();
	}
}
