package service;

import java.sql.Date;
import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}
	public List<ItemGroup> itemGroups(Date date){
		return itemGroupDao.getItemToDay(date);
		
	}
}
