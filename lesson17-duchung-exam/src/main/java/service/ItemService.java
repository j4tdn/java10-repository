package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import persistence.Items;
import persistence.ItemsDto;

public class ItemService {
	private ItemDao itemDao;

	public ItemService() {
		itemDao = new ItemDao();
	}

	public List<Items> getItems() {
		return itemDao.getItems();
	}
	public List<ItemsDto> getItemsOfGroupId() {
		return itemDao.getItemsOfGroupId();
	}
	public List<ItemsDto> getItems(LocalDate salesDate){
		return itemDao.getItems(salesDate);
	}
}
