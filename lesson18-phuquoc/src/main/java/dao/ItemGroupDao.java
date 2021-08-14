package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemGroupDto2;
import persistence.ItemGroupDto4;
import persistence.ItemSaleGroup;
import persistence.ItemTop;

public interface ItemGroupDao {
	
	List<ItemSaleGroup> getItemSaleGroups(LocalDate dateSale);
	
	List<ItemGroupDto2> getItemGroupDtos2();
	
	List<ItemTop> getItemTop(int year);
	
	List<ItemGroupDto4> getItemGroupDtos4();

}