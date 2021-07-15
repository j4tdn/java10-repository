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

	public ItemGroup getItemGroups(int id) {
		return itemGroupDao.getItemGroups(id);
	}

	public List<ItemGroup> getItemGroups(String name) {
		return itemGroupDao.getItemGroups(name);
	}

	public boolean save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}
	
	public boolean update(int idOD) {
		return itemGroupDao.update(idOD);
	}
	
	public List<ItemGroup> getItemGroup10(int id) {
		return itemGroupDao.getItemsByIdProcedure(id);
	}
	
	public boolean saveFile() {
		return itemGroupDao.saveFile();
	}
}

