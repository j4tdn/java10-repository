package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	List<ItemGroup> getAllHql();
	
	List<ItemGroupDto> getItemGroupDtos();
	
	ItemGroup get(int igrId);
}
