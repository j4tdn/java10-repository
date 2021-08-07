package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.EntityDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupDaoImpl extends EntityDao implements ItemGroupDao {

	private static String GET_ALL_DTOS = "SELECT lh.MaLoai AS " + ItemGroupDto.ID + ",\n"
										+ "       lh.TenLoai AS " + ItemGroupDto.NAME + ",\n"
										+ "       SUM(kcmh.SoLuong) AS " + ItemGroupDto.TOTAL_AMOUNT + "\n"
										+ "FROM LoaiHang lh\n"
										+ "JOIN MatHang  mh\n"
										+ "  ON lh.MaLoai = mh.MaLoai\n"
										+ "JOIN KichCoMatHang kcmh\n"
										+ "  ON mh.MaMH = kcmh.MaMH\n"
										+ "GROUP BY lh.MaLoai";
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
				.createNativeQuery("SELECT * FROM LoaiHang", ItemGroup.class)
				.getResultList();
	}
	
	@Override
	public List<ItemGroup> getAllHql() {
		return openSession()
				.createQuery("SELECT igr FROM ItemGroup igr", ItemGroup.class)
				.getResultList();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ALL_DTOS);
		
		query.addScalar(ItemGroupDto.ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemGroupDto.NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemGroupDto.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
			 .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
			 
		return safeList(query);
	}
	
	@Override
	public ItemGroup get(int igrId) {
		return openSession().get(ItemGroup.class, igrId);
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(itemGroup);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
	}

}
