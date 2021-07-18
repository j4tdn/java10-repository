package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupStorage;
import persistence.ItemGroupTime;

public class ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	public List<Item> getTopItems(){
		return itemGroupDao.getTopItems();
	}
	
	public List<ItemGroupStorage> getItemsInStorage(){
		return itemGroupDao.getItemsInStorage();
	}
	
	public List<ItemGroupTime> getItemInDay(LocalDate date){
		return itemGroupDao.getItemInDay(date);
	}
	
}
