package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	ItemGroup get(int igrId);
}
