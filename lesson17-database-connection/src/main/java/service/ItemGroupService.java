package service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroup2;
import persistence.ItemGroupDto;
import persistence.ItemGroupRawData;

// Service
// 1. Get data from DAO layer
// 2. [Process logic]
// 3. Return data to VIEW
public class ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}
	
	public List<ItemGroup> getAll(){
		return itemGroupDao.getAll();		
	}
	
	public ItemGroup getItemGroups(int id){
		return itemGroupDao.getItemGroups(id);		
	}
	
	public List<ItemGroup> getItemGroups(String name){
		return itemGroupDao.getItemGroups(name);		
	}

	public boolean save(ItemGroup itemGroup) {
		return itemGroupDao.save(itemGroup);
	}
	
	public List<ItemGroup2> getItemGroup2s(int id, int saleIn, int saleOut){
		return itemGroupDao.getIdPrice(id, saleIn, saleOut);	
	}
	
	public List<ItemGroupDto> getItemGroups(){
		return itemGroupDao.getItemGroups().stream()
							.map(ItemGroupRawData::transfer)
							.collect(Collectors.toList());	
	}
	
	public List<ItemGroup2> getItemGroup2ss(LocalDate date){
		return itemGroupDao.getItemToDay(date);	
	}
	
	public boolean addBatch(List<ItemGroup> itemGroups) {
		return itemGroupDao.addBatch(itemGroups);
	}
	
	public List<String> strings(Integer year,Integer limit) {
		return itemGroupDao.getTop(year, limit);
	}
}
