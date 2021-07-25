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
	
	public List<ItemGroupDto> getItemGroups() {
		return itemGroupDao.getItemGroups()
						   .stream()
						   .map(ItemGroupRawData::transfer)
						   .collect(Collectors.toList());
	}
	
	public boolean save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}
	
	public boolean addBatch(List<ItemGroup> itemGroups) {
		return itemGroupDao.addBatch(itemGroups);
	}
}
