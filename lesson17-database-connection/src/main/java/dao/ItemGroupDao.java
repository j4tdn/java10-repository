package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.ItemGroup2;
import persistence.ItemGroupRawData;
import utils.SqlUtils;

public class ItemGroupDao {
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pst;
	private Statement st;
	
	public ItemGroupDao(){
		conn = DbConnection.getConnection();
		
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();

		String sql = "select MaLoai,\n" + "			 TenLoai\n" + "	  from loaiHang";
		
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			// ResultSet = List<T> >> T: columns label, index

			// iterator
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	
	public ItemGroup getItemGroups(int id) {
		ItemGroup result = null;
		String sql = "SELECT * \n"
					+ "FROM LoaiHang\n"
					+ "WHERE MaLoai = " + id;
		conn = DbConnection.getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			if (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	public List<ItemGroup> getItemGroups(String name) {
		List<ItemGroup> result = new ArrayList<>();

		String sql = "SELECT * \n"
				+ "FROM LoaiHang\n"
				+ "WHERE TenLoai = ?";
		
//		System.out.println("SQL: " + sql);
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			// ResultSet = List<T> >> T: columns label, index

			// iterator
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	
	public boolean save(ItemGroup itemGroup) {
		boolean isSaved = false;
		
		// prepared SQL with ? parameters
		String sql = "insert into LoaiHang(MaLoai, TenLoai)\n"
				+ "values(?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			
			
			isSaved = pst.executeUpdate() > 0;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return isSaved;
	}
	
	public List<ItemGroup2> getIdPrice(int id, int saleIn, int saleOut) {
		List<ItemGroup2> result = new ArrayList<>();

		String sql = "select * from MatHang where MaLoai = " + id + " and giaBan between " + saleIn +" and "+saleOut+"";
		
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup2 ig = new ItemGroup2(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getInt("giaBan"));
				result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	
	public List<ItemGroupRawData> getItemGroups() {
		List<ItemGroupRawData> result = new ArrayList<>();

		String sql = "WITH TMP_CTE AS (\n"
				+ "	SELECT mh.TenMH,\n"
				+ "			SUM(kcmh.SoLuong) SoLuong,\n"
				+ "            mh.MaLoai\n"
				+ "    FROM MatHang mh\n"
				+ "    JOIN KichCoMatHang kcmh\n"
				+ "		ON mh.MaMH = kcmh.MaMH\n"
				+ "    GROUP BY mh.MaMH\n"
				+ ")\n"
				+ "SELECT lh.MaLoai,\n"
				+ "		lh.TenLoai,\n"
				+ "        GROUP_CONCAT(CONCAT(mh.TenMH, '-' , mh.SoLuong) SEPARATOR ',') DanhSachMatHang,\n"
				+ "        SUM(mh.SoLuong) TongSoLuong\n"
				+ "FROM LoaiHang lh\n"
				+ "JOIN TMP_CTE mh\n"
				+ "	ON lh.MaLoai = mh.MaLoai\n"
				+ "GROUP BY lh.MaLoai;";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroupRawData data = new ItemGroupRawData();
				data.setIgrId(rs.getInt("MaLoai"));
				data.setIgrName(rs.getString("TenLoai"));
				data.setItems(rs.getString("DanhSachMatHang"));
				data.setTotalOfItems(rs.getInt("TongSoLuong"));
				result.add(data);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	
	public List<ItemGroup2> getItemToDay(LocalDate date) {
		List<ItemGroup2> result = new ArrayList<>();

		String sql = "select mh.MaMH, mh.TenMH, dh.thoigiandathang "
				+"from mathang mh "
				+"join chitietdonhang ctdh "
				+"on mh.MaMH = ctdh.MaMH "
				+"join donhang dh "
				+"on dh.MaDH = ctdh.MaDH "
				+"where date(dh.thoigiandathang) = '"
				+ date + "'";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup2 ig = new ItemGroup2(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDate("thoigiandathang"));
				result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	
	public boolean addBatch(List<ItemGroup> itemGroups) {
		boolean isSaved = false;

		// prepared SQL with ? parameters
		String sql = "insert into LoaiHang(MaLoai, TenLoai)\n" + "values(?,?)";
		try {
			pst = conn.prepareStatement(sql);

			for (ItemGroup itemGroup : itemGroups) {
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
			}

			isSaved = Arrays.stream(pst.executeBatch()).sum() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return isSaved;
	}
	
	public List<String> getTop(Integer year, Integer limit) {
		List<String> list = new ArrayList<>();
		String sql = "SELECT mh.MaMH,\r\n"
					+ "		mh.TenMH,\r\n"
					+ "        SUM(ctdh.SoLuong) SoLuong\r\n"
					+ "FROM mathang mh\r\n"
					+ "JOIN chitietdonhang ctdh\r\n"
					+ "	ON mh.MaMH = ctdh.MaMH\r\n"
					+ "JOIN donhang dh\r\n"
					+ "	ON dh.MaDH = ctdh.MaDH\r\n"
					+ "WHERE year(dh.ThoiGianDatHang) = ?\r\n"
					+ "GROUP BY mh.MaMH\r\n"
					+ "ORDER BY SoLuong DESC,	\r\n"
					+ "		mh.MaMH\r\n"
					+ "LIMIT ? ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, year);
			pst.setInt(2, limit);
			rs = pst.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("TenMH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
