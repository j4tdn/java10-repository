package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroupDto;

public class ItemGroupServiceIml implements ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceIml() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemGroupDto> getItemGroupDaoById() {
		// TODO Auto-generated method stub
		return  itemGroupDao.getItemGroupDaoById();
	}

	
}
