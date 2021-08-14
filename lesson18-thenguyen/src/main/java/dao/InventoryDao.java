package dao;

import java.util.List;

import persistence.InventoryDto;
import persistence.InventoryDtoTop3;
import persistence.InventoryDto;

public interface InventoryDao {
	
	List<InventoryDto> getItemGroupDtos();
	
	List<InventoryDtoTop3> getItemGroupDtosTop3();

}
