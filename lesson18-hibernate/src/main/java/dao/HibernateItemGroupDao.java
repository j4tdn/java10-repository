package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

import javassist.convert.Transformer;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends EnityDao implements ItemGroupDao {
	private static final String GEt_ITEM_DTOS = ""
			+ "SELECT lh.maLoai as "+ItemGroupDto.ID+", lh.TenLoai "+ItemGroupDto.NAME+", SUM(kcmh.SoLuong) as "+ItemGroupDto.TOTAL_AMOUNT+" \r\n" + 
			"FROM MatHang mh \r\n" + 
			"JOIN LoaiHang lh	\r\n" + 
			"  ON mh.MaLoai = lh.MaLoai \r\n" + 
			"JOIN KichCoMatHang kcmh \r\n" + 
			"  ON mh.MaMH = kcmh.MaMH\r\n" + 
			"GROUP BY mh.maloai\r\n" + 
			"                ";
	// NativeQuery: E.g select col1,col2 from tableA
	// mapping: tableA = EnityA
	//          col1=att1	
	//          col2=att2
	// HibernateQueryLanguage(HQL) same with javaPersistenceLanguage :
	// selsect e1 from enity1 e1 where e1.att1 = val1
	
	//c1. NativeQuery
//	public List<ItemGroup> getAll() {
//		String sql = "select * from loaihang";
//		Session session = openSession();
//		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
//		// require: ItemGroup is a Enity
//		// return openSession().createNativeQuery(sql, ItemGroup.class).getResultList();
//		return query.getResultList();
//	}
	//c2.  HQL/JPQL
	public List<ItemGroup> getAll() {
		// In HQL/JPQL have sp @NamedQueries: can add @NamedQueries in class Enity replace sql in createQuery  
		String name = ItemGroup.Get_ALL;
		Session session = openSession();
		return  session.createNamedQuery(name, ItemGroup.class).getResultList();
		
		//HQL:
		// "select ig from ItemGroup ig" same with "from ItemGroup"
		//String sql = "from ItemGroup";
		// Session session = openSession();
		//return  session.createQuery(sql, ItemGroup.class).getResultList();
	}

	public ItemGroup get(int igrId) {
		// "select ig from ItemGroup ig where ig.igrId = :maloai" using createQuery replace createNativeQuery
		NativeQuery<ItemGroup> query2 = openSession().createNativeQuery("select * from loaihang where Maloai = :Maloai",
				ItemGroup.class);
		//  StandardBasicTypes.INTEGER: [make the code clearer]
		query2.setParameter("Maloai", igrId, StandardBasicTypes.INTEGER);
		return query2.getSingleResult();
		// or return openSession().createNativeQuery("select * from loaihang where Maloai = :xyz",
		// ItemGroup.class).setParameter("xyz", igrId, StandardBasicTypes.INTEGER).getSingleResult();
	}

	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		// TODO Auto-generated method stub
		NativeQuery<?> query = openSession().createNativeQuery(GEt_ITEM_DTOS);
		query.addScalar(ItemGroupDto.ID, StandardBasicTypes.INTEGER)
		.addScalar(ItemGroupDto.NAME, StandardBasicTypes.STRING)
		.addScalar(ItemGroupDto.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
		.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}
	
}
