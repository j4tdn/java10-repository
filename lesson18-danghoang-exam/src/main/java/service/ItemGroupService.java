package service;

import java.util.List;
import java.util.stream.Collectors;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemGroupRawData;


public class ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		// when new create ItemService then new create itemGroupDao;
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
		
		public boolean save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}
		public List<ItemGroupDto> getItemGroups() {
			return itemGroupDao.getItemGroups()
								.stream()
								.map(ItemGroupRawData::transfer)
								.collect(Collectors.toList());
		}
	
}