package service.impl;

import java.util.List;

import dao.ItemGroupDao;
import dao.impl.ItemGroupDaoImpl;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new ItemGroupDaoImpl();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroup> getAllHql() {
		return itemGroupDao.getAllHql();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		return itemGroupDao.getItemGroupDtos();
	}
	
	@Override
	public ItemGroup get(int igrId) {
		return itemGroupDao.get(igrId);
	}

}
