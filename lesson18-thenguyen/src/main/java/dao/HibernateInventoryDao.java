package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.InventoryDto;
import persistence.InventoryDtoTop3;
import persistence.InventoryDto;

public class HibernateInventoryDao extends EntityDao implements InventoryDao {
	//Câu 2
	private static final String GET_ITEM_DTOS=
			"SELECT lh.MaLoai AS " 			 + InventoryDto.ID 			 + ",\n"
			+ "       lh.TenLoai AS " 		 + InventoryDto.NAME 		 + ",\n"
			+ "       SUM(kcmh.SoLuong) AS " + InventoryDto.TOTAL_AMOUNT + " \n"
			+ "FROM LoaiHang lh\n"
			+ "JOIN MatHang  mh\n"
			+ "  ON lh.MaLoai = mh.MaLoai\n"
			+ "JOIN KichCoMatHang kcmh\n"
			+ "  ON mh.MaMH = kcmh.MaMH\n"
			+ "GROUP BY lh.MaLoai";
	
	//Câu 3
	private static final String GET_ITEMGROUP=
			"SELECT mh.MaMH AS "+ InventoryDtoTop3.ID+",\n"
			+ "	    mh.TenMH AS "+ InventoryDtoTop3.NAME+",\n"
			+ "		sum(ctdh.soluong) AS "+ InventoryDtoTop3.TOTAL_AMOUNT+"\n"
			+ "	FROM MatHang mh\n"
			+ "	JOIN ChiTietDonHang ctdh\n"
			+ "	ON mh.MaMH = ctdh.MaMH\n"
			+ "	JOIN DonHang dh\n"
			+ "	ON dh.MaDH = ctdh.MaDH\n"
			+ "	WHERE Year(dh.ThoiGianDatHang) = 2020 \n"
			+ "	GROUP BY mh.maMH \n"
			+ "	ORDER BY "+InventoryDtoTop3.TOTAL_AMOUNT+" DESC\n"
			+ "	LIMIT 3";

	public List<InventoryDto> getItemGroupDtos() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS);
		query.addScalar(InventoryDto.ID, StandardBasicTypes.INTEGER)
			 .addScalar(InventoryDto.NAME, StandardBasicTypes.STRING)
			 .addScalar(InventoryDto.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
			 .setResultTransformer(Transformers.aliasToBean(InventoryDto.class));
		
		return safeList(query);
		
	}

	@Override
	public List<InventoryDtoTop3> getItemGroupDtosTop3() {
		
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEMGROUP);
		query.addScalar(InventoryDtoTop3.ID, StandardBasicTypes.INTEGER)
			 .addScalar(InventoryDtoTop3.NAME, StandardBasicTypes.STRING)
			 .addScalar(InventoryDtoTop3.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
			 .setResultTransformer(Transformers.aliasToBean(InventoryDtoTop3.class));
		
		return safeList(query);
	}
	

	
	

	


}