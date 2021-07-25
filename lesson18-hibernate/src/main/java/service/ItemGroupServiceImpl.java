package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao ItemGroupDao;

	public ItemGroupServiceImpl() {
		ItemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemGroup> getAll() {
		return ItemGroupDao.getAll();
	}

}
