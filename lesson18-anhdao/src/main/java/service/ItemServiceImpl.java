package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemDate;
import persistence.ItemSizeDto;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	@Override
	public List<ItemDate> getItemDate(LocalDate date) {
		
		return itemDao.getItemDate(date);
	}
	
	@Override
	public List<String> getItemBestSeller(int year, int top) {
		return itemDao.getItemBestSeller(year, top);
	}
	
	@Override
	public List<ItemSizeDto> getItemByGroup() {
		
		return itemDao.getItemByGroup();
	}

}