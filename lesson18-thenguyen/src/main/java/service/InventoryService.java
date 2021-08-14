package service;

import java.util.List;
import persistence.InventoryDto;
import persistence.InventoryDtoTop3;

public interface InventoryService {
	
	List<InventoryDto> getDtos();
	List<InventoryDtoTop3> getDtoTop3s();
}
