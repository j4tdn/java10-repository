package service;

import java.util.List;
import java.util.stream.Collectors;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemGroupRawData;

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
	
	public List<ItemGroupDto> getItemGroups() {
		return itemGroupDao.getItemGroups()
				           .stream()
				           .map(ItemGroupDto::new)
				           .collect(Collectors.toList());
	}
	
	public boolean save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}
	
	public boolean addBatch(List<ItemGroup> itemGroups) {
		return itemGroupDao.addBatch(itemGroups);
	}
}
