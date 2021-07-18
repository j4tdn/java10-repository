package service;

import java.util.List;

import java.util.stream.Collectors;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

//Service:
//1.Get data from Dao Layer
//2. Process logic
//3. Return data to VIEW
public class ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroupDto> getItemsByGroup() {
		return itemGroupDao.getItemsByGroup();
	}
	
}
