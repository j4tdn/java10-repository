package service;

import java.io.IOException;
import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;
// service
// 1. get data from Dao Layer
// 2. co hoac khong co[Process logic]
// 3. return data to UI(view)
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
	public boolean save() throws NumberFormatException, IOException {
		return itemGroupDao.save();
	}
}
