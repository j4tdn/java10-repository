package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		return itemGroupDao.getItemGroupDtos();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

}
