package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroup> getAll(); 
	ItemGroup get(int igrId);
	List<ItemGroupDto> getItemGroupDtos();
}
	