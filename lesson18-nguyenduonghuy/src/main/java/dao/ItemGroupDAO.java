package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDAO {

	List<ItemGroup> getAllQuantity();
	
	List<ItemGroupDto> getItemGroupDtos();
}
