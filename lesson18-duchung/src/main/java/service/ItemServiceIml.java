package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.ItemDto;
import persistence.ItemTop3;
import persistence.ListItemByGroudIdDto;

public class ItemServiceIml implements ItemService {
	private ItemDao ItemDao;

	public ItemServiceIml() {
		ItemDao = new HibernateItemDao();
	}

	public List<ItemDto> getItemBySalesDate(LocalDate salesDate) {
		// TODO Auto-generated method stub
		return ItemDao.getItemBySalesDate(salesDate);
	}

	@Override
	public List<ItemTop3> getItemTop3ByYear(Integer year) {
		// TODO Auto-generated method stub
		return ItemDao.getItemTop3ByYear(year);
	}

	@Override
	public List<ListItemByGroudIdDto> getListItemByGroudIdDto() {
		// TODO Auto-generated method stub
		return ItemDao.getListItemByGroudIdDto();
	}
	
}
