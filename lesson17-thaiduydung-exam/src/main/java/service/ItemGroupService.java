package service;

import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

}
