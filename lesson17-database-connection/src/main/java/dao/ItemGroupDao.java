package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.ItemGroupRawData;

public class ItemGroupDao {
	private Connection connection;
	private java.sql.Statement st = null;
	private java.sql.PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemGroupDao() {
		connection = DbConnection.getConnection();
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "select * from loaihang";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql); // no se duyet tung dong cho minh, phai dung 1 co che giong iterator
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("maloai"), rs.getString("tenloai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return result;
	}

	public List<ItemGroup> getItemGroups(int id) {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "select * from loaihang where maloai = " + id;
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql); // no se duyet tung dong cho minh, phai dung 1 co che giong iterator
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("maloai"), rs.getString("tenloai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return result;
	}

	public List<ItemGroup> getItemGroups(String name) {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "select * from loaihang where tenloai = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery(); // no se duyet tung dong cho minh, phai dung 1 co che giong iterator
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("maloai"), rs.getString("tenloai"));
				result.add(ig);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return result;
	}

	public boolean save(ItemGroup itemGroup) {
		boolean isSave = false;
		// prepared SQL with ? parameter
		String sql = "insert into loaihang values (?,?)";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			isSave = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return isSave;
	}
	// important
	public List<ItemGroupRawData> getItemGroups() {
		List<ItemGroupRawData> result = new ArrayList<>();
		String sql = "WITH TMP_CTE as( SELECT lh.maLoai, mh.TenMH,\r\n" + 
				"		SUM(kcmh.SoLuong) as SoLuong\r\n" + 
				"FROM MatHang mh\r\n" + 
				"JOIN LoaiHang lh\r\n" + 
				"	ON mh.MaLoai = lh.MaLoai\r\n" + 
				"JOIN KichCoMatHang kcmh\r\n" + 
				"	ON mh.MaMH = kcmh.MaMH\r\n" + 
				"GROUP BY mh.TenMH)\r\n" + 
				"SELECT lh.maLoai, lh.TenLoai,\r\n" + 
				"		group_concat(concat(mh.TenMH, '-', mh.SoLuong) SEPARATOR ',') DanhSachmatHang, \r\n" + 
				"        Sum(mh.SoLuong) as TongSoLuong \r\n" + 
				"from loaihang lh\r\n" + 
				"JOIN TMP_CTE mh\r\n" + 
				"on lh.MaLoai = mh.MaLoai\r\n" + 
				"GROUP BY MaLoai";
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery(); 
			//pst.setString(1, name);
			rs = pst.executeQuery(); // no se duyet tung dong cho minh, phai dung 1 co che giong iterator
			while (rs.next()) {
				ItemGroupRawData data = new ItemGroupRawData();
				data.setIgrId(rs.getInt("maLoai"));
				data.setIgrname(rs.getString("TenLoai"));
				data.setItems(rs.getString("DanhSachmatHang"));
				data.setTotalOfItem(rs.getInt("TongSoLuong"));
				result.add(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return result;
	}
	
	public boolean addBatch(List<ItemGroup> itemGroup) {
		boolean isSave = false;
		// prepared SQL with ? parameter
		String sql = "insert into loaihang values (?,?)";
		try {
			pst = connection.prepareStatement(sql);
			for(ItemGroup i : itemGroup) {
				pst.setInt(1, i.getId());
				pst.setString(2, i.getName());
				pst.addBatch();
			}
			 System.out.println(Arrays.stream(pst.executeBatch()).sum());
			 isSave = Arrays.stream(pst.executeBatch()).sum()>0 ;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return isSave;
	}

}
