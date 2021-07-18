package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemGroupDao;
import persistence.CategoryGroup;
import persistence.ItemGroup;
import persistence.ItemSaleGroup;
import persistence.ItemTop;

// Service
// 1. GET data from DAO layer
// 2. [Process logic]
// 3. RETURN data to VIEW

public class ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}
	
	public List<CategoryGroup> getToTalCategorys(){
		return itemGroupDao.getToTalCategorys();
	}
	
	public List<ItemGroup> getAllItems(){
		return itemGroupDao.getAllItems();
	}
	
	public List<ItemTop> getTopItemInYear(){
		return itemGroupDao.getTopItemInYear();
	}
	
	public List<ItemSaleGroup> getItemSale(LocalDate dateSale){
		return itemGroupDao.getItemSale(dateSale);
	}
	
}
