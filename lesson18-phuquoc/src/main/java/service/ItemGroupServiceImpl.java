package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroupDto2;
import persistence.ItemGroupDto4;
import persistence.ItemSaleGroup;
import persistence.ItemTop;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemSaleGroup> getSaleGroups(LocalDate dateSale) {
		return itemGroupDao.getItemSaleGroups(dateSale);
	}

	@Override
	public List<ItemGroupDto2> getDtos() {
		return itemGroupDao.getItemGroupDtos2();
	}

	@Override
	public List<ItemTop> getItemTop(int year) {
		return itemGroupDao.getItemTop(year);
	}

	@Override
	public List<ItemGroupDto4> getDto4s() {
		return itemGroupDao.getItemGroupDtos4();
	}

}