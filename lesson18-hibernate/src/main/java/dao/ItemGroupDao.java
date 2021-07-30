package dao;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	ItemGroup get(int igrId);
}