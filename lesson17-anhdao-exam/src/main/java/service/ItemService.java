package service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import persistence.Item;
import persistence.ItemDate;
import persistence.ItemDto;


public class ItemService {
	private ItemDao itemDao;

	public ItemService() {
		itemDao = new ItemDao();
	}

	public List<String> getItemBestSeller( int year) {
		return itemDao.getItemBestSeller(year) ;
	}
	
	public List<ItemDto> getItemByGroup() {
		return itemDao.getItemByGroup() ;
	}
    public List<ItemDate> getItembyDate(LocalDate date) {
    	return itemDao.getItembyDate(date) ;
    }
}


