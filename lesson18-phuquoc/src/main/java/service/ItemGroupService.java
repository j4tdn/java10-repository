package service;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemGroupDto2;
import persistence.ItemGroupDto4;
import persistence.ItemSaleGroup;
import persistence.ItemTop;

public interface ItemGroupService {
	
	List<ItemSaleGroup> getSaleGroups(LocalDate dateSale);
	
	List<ItemGroupDto2> getDtos();
	
	List<ItemTop> getItemTop(int year);
	
	List<ItemGroupDto4> getDto4s();

}