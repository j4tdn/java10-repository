package service;

import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.Items;


public class ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		// when new creat ItemService then new creat itemGroupDao;
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	public List<ItemGroup> getItemGroups(int id) {
		return itemGroupDao.getItemGroups(id);
	}
	public List<ItemGroup> getItemGroups(String name) {
		return itemGroupDao.getItemGroups(name);
	}
	public boolean save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}
	public boolean save() {
		return itemGroupDao.save();
	}
}
