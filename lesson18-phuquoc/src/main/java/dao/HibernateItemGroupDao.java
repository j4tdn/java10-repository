package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroupDto2;
import persistence.ItemGroupDto4;
import persistence.ItemSaleGroup;
import persistence.ItemTop;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {
	
	//cau1
	private static final String GET_ITEM_SALE = 
			"SELECT mh.MaMH "+ItemSaleGroup.ID +",\r\n"
			+ "		mh.TenMH "+ItemSaleGroup.NAME +",\r\n"
			+ "		dh.ThoiGianDatHang "+ItemSaleGroup.TIME +"\r\n"
			+ "FROM MatHang mh\r\n"
			+ "JOIN chitietdonhang ctdh\r\n"
			+ "	ON mh.MaMH = ctdh.MaMH\r\n"
			+ "JOIN DonHang dh\r\n"
			+ "	ON dh.MaDH = ctdh.MaDH\r\n";
	@Override
	public List<ItemSaleGroup> getItemSaleGroups(LocalDate dateSale) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_SALE);
		
		query.addScalar(ItemSaleGroup.ID, StandardBasicTypes.INTEGER)
			.addScalar(ItemSaleGroup.NAME, StandardBasicTypes.STRING)
			.addScalar(ItemSaleGroup.TIME, StandardBasicTypes.TIME)
			.setResultTransformer(Transformers.aliasToBean(ItemSaleGroup.class));
		return safeList(query);
	}

	
	//cau2
	private static final String GET_ITEM_DTOS=
			"SELECT lh.MaLoai AS " + ItemGroupDto2.ID + ",\r\n"
			+ "       lh.TenLoai AS " + ItemGroupDto2.NAME + ",\r\n"
			+ "       SUM(kcmh.SoLuong) AS " + ItemGroupDto2.TOTAL_AMOUNT + " \r\n"
			+ "FROM LoaiHang lh\r\n"
			+ "JOIN MatHang  mh\r\n"
			+ "  ON lh.MaLoai = mh.MaLoai\r\n"
			+ "JOIN KichCoMatHang kcmh\r\n"
			+ "  ON mh.MaMH = kcmh.MaMH\r\n"
			+ "GROUP BY lh.MaLoai";
	@Override
	public List<ItemGroupDto2> getItemGroupDtos2() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS);
		
		query.addScalar(ItemGroupDto2.ID, StandardBasicTypes.INTEGER)
			.addScalar(ItemGroupDto2.NAME, StandardBasicTypes.STRING)
			.addScalar(ItemGroupDto2.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
			.setResultTransformer(Transformers.aliasToBean(ItemGroupDto2.class));
		return safeList(query);
	}
	
	
	//cau3
	private static final String GET_ITEM_TOP=
			"SELECT lh.*,\r\n"
					+ "		mh.MaMH,\r\n"
					+ "		mh.TenMh AS " + ItemTop.NAME + ", \r\n"
					+ "        mh.GiaBan,\r\n"
					+ "		mh.GiaMua,\r\n"
					+ "		kcmh.Soluong AS SoLuong\r\n"
					+ "FROM LoaiHang lh\r\n"
					+ "JOIN MatHang mh\r\n"
					+ "	ON mh.MaLoai = lh.MaLoai\r\n"
					+ "JOIN kichcomathang kcmh\r\n"
					+ "	ON kcmh.MaMH = mh.MaMH\r\n"
					+ "JOIN chitietdonhang ctdh\r\n"
					+ "	ON ctdh.MaMH = kcmh.MaMh\r\n"
					+ "JOIN DonHang dh\r\n"
					+ "	ON dh.MaDH = ctdh.MaDH\r\n"
					+ "GROUP BY mh.maMH\r\n"
					+ "ORDER BY kcmh.Soluong DESC\r\n"
					+ "LIMIT 3;";
	@Override
	public List<ItemTop> getItemTop(int year) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_TOP);
		
		query.addScalar(ItemGroupDto2.NAME, StandardBasicTypes.STRING)
			.setResultTransformer(Transformers.aliasToBean(ItemTop.class));
		return safeList(query);
	}
	
	
	//cau4
	private static final String GET_ITEM_DTOS4=
			"SELECT lh.maLoai AS " + ItemGroupDto4.IDCATEGORY + ", \r\n"
			+ "			lh.TenLoai " + ItemGroupDto4.NAMECATEGORY + ", \r\n"
			+ "	        mh.maMH "+ ItemGroupDto4.IDITEM +", \r\n"
			+ "	        mh.TenMH "+ ItemGroupDto4.NAMEITEM +", \r\n"
			+ "	        mh.GiaBan "+ ItemGroupDto4.PRICESELL +", \r\n"
			+ "	        mh.GiaMua "+ ItemGroupDto4.PRICEBUY +",\r\n"
			+ "			SUM(kcmh.SoLuong) "+ ItemGroupDto4.TOTAL +"\r\n"
			+ "	FROM MatHang mh\r\n"
			+ "	JOIN LoaiHang lh\r\n"
			+ "	ON mh.MaLoai = lh.MaLoai\r\n"
			+ "	JOIN KichCoMatHang kcmh\r\n"
			+ "	ON mh.MaMH = kcmh.MaMH\r\n"
			+ "	GROUP BY mh.maLoai,mh.maMH";
	@Override
	public List<ItemGroupDto4> getItemGroupDtos4() {
NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS4);
		
		query.addScalar(ItemGroupDto4.IDCATEGORY, StandardBasicTypes.INTEGER)
			.addScalar(ItemGroupDto4.NAMECATEGORY, StandardBasicTypes.STRING)
			.addScalar(ItemGroupDto4.IDITEM, StandardBasicTypes.INTEGER)
			.addScalar(ItemGroupDto4.NAMEITEM, StandardBasicTypes.STRING)
			.addScalar(ItemGroupDto4.PRICESELL, StandardBasicTypes.INTEGER)
			.addScalar(ItemGroupDto4.PRICEBUY, StandardBasicTypes.INTEGER)
			.addScalar(ItemGroupDto4.TOTAL, StandardBasicTypes.INTEGER)
			.setResultTransformer(Transformers.aliasToBean(ItemGroupDto4.class));
		return safeList(query);
	}
	
	// cau 5
	private static final String EMPLPYEES_SALARY ="";
}