package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.InventoryDto;

public class HibernateInventoryDao extends EntityDao implements InventoryDao {
	
	private static final String INVENTORY_DTOS=
            "SELECT lh.MaLoai AS "              + InventoryDto.ID              + ",\n"
            + "       lh.TenLoai AS "          + InventoryDto.NAME          + ",\n"
            + "       SUM(kcmh.SoLuong) AS " + InventoryDto.AMOUNT + " \n"
            + "FROM LoaiHang lh\n"
            + "JOIN MatHang  mh\n"
            + "  ON lh.MaLoai = mh.MaLoai\n"
            + "JOIN KichCoMatHang kcmh\n"
            + "  ON mh.MaMH = kcmh.MaMH\n"
            + "GROUP BY lh.MaLoai";

	@SuppressWarnings("deprecation")
	@Override
	public List<InventoryDto> getInventory() {
		NativeQuery<?> query = openSession().createNativeQuery(INVENTORY_DTOS);

		query.addScalar(InventoryDto.ID, StandardBasicTypes.INTEGER)
				.addScalar(InventoryDto.NAME, StandardBasicTypes.STRING)
				.addScalar(InventoryDto.AMOUNT, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(InventoryDto.class));

		return safeList(query);
	}

}
