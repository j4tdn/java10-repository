package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceIml implements ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceIml() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	@Override
	public ItemGroup get(int igrId) {
		return itemGroupDao.get(igrId);
	}

	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		// TODO Auto-generated method stub
		return itemGroupDao.getItemGroupDtos();
	}
	
	@Override
	public boolean save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "item group can be null");
		return itemGroupDao.save(itemGroup);
	}
	
}
