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
	
	public ItemGroup getById(Integer categoryId) {
		return itemGroupDao.getById(categoryId);
	}
	
	public ItemGroup getByName(String categoryName) {
		return itemGroupDao.getByName(categoryName);
	}
	
	public List<ItemGroupDto> getItemGroups() {
		List<ItemGroupRawData> raw = itemGroupDao.getItemGroups();
		return raw.stream()
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
