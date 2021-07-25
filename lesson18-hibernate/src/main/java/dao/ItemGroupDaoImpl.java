package dao;

import java.util.List;

import persistence.ItemGroup;

public class ItemGroupDaoImpl extends EntityDao implements ItemGroupDao {

	@Override
	public List<ItemGroup> getAll() {
		return openSession()
				.createNativeQuery("SELECT * FROM LoaiHang", ItemGroup.class)
				.getResultList();
	}

}
