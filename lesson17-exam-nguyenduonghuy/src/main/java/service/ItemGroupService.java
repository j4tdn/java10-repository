package service;

import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroupDto;

public class ItemGroupService {
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}
	
	public List<ItemGroupDto> getAllItemGroupDto() {
		return itemGroupDao.getAllItemGroupDto();
	}
}
