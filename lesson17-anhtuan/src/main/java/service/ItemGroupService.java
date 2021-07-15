package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroup2;
import persistence.ItemGroup3;

public class ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroup> getAll(){
		return itemGroupDao.getAll();
	}
	
	public ItemGroup getItemGroups(int id) {
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
	
	public List<ItemGroup3> getItemGroup3s(){
		return itemGroupDao.getInventory();	
	}
	
	public List<ItemGroup2> getItemGroup2ss(LocalDate date){
		return itemGroupDao.getItemToDay(date);	
	}
	
	public boolean update(int idOD) {
		return itemGroupDao.update(idOD);
	}
	
	public List<ItemGroup2> getItemGroup2sss(int id){
		return itemGroupDao.getItemsByIdProcedure(id);	
	}
	
	public boolean saveFile() {
		return itemGroupDao.saveFile();
	}
}
