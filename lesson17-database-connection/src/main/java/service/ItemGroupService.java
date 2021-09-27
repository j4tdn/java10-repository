package service;

import java.util.List;
import java.util.stream.Collectors;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

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

	public List<ItemGroupDto> getItemGroups() {
		// or .map(ItemGroupRawData::transfer)
		return itemGroupDao.getItemGroups().stream().map(raw -> raw.transfer()).collect(Collectors.toList());

	}

	public boolean save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}
	
	public boolean addBatch(List<ItemGroup> itemGroup) {
		return itemGroupDao.addBatch(itemGroup);
	}
}
