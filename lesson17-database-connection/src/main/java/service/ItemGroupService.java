package service;

import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;

// Service
// 1. GET data from DAO layer
// 2. [Process logic]
// 3. RETURN data to VIEW
public class ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	public ItemGroup getItemGroups(int id) {
		return itemGroupDao.getItemGroups(id);
	}

	public List<ItemGroup> getItemGroups(String name) {
		return itemGroupDao.getItemGroups(name);
	}

	public boolean save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}

}
