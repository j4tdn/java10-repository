package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.ItemGroup2;
import persistence.ItemGroup3;
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
	
	public List<ItemGroup3> getInventory() {
		List<ItemGroup3> result = new ArrayList<>();

		String sql = "select lh.*, "
				+"group_concat(concat(mh.TenMH, ':',kcmh.SoLuong) SEPARATOR ', ') danhsachmathangvasoluong, "
				+"sum(kcmh.soluong) tongsoluong "
				+"from mathang mh "
				+"join LoaiHang lh "
				+"on mh.MaLoai = lh.MaLoai "
				+"join KichCoMatHang kcmh "
				+"on mh.MaMH = kcmh.MaMH "
				+"group by lh.MaLoai";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup3 ig = new ItemGroup3(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getString("danhsachmathangvasoluong"), rs.getInt("tongsoluong"));
				result.add(ig);
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
	
	public boolean update(int idOD) {
		boolean isUp = false;
		
		String sql = "update DonHang set tongtien = 999 "
				+ "where maDH = ? ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idOD);
						
			isUp = pst.executeUpdate() > 0;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return isUp;
	}
	
	public List<ItemGroup2> getItemsByIdProcedure(int itemGroupId) {
		List<ItemGroup2> listItems = new ArrayList<>();	
		String sql = "CALL showItemsByGroupId(" + itemGroupId + ")";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup2 item = new ItemGroup2(rs.getInt("maMH"), rs.getString("tenMH"), rs.getInt("giaBan"));
				listItems.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return listItems;
	}
	
	public boolean saveFile() {
		boolean isSave = false;
		File f = new File("loaihang.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String sql = "insert into loaihang values (?,?)";
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String dr = "";

			while ((dr = br.readLine()) != null) {
				pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(dr.substring(0, dr.indexOf(","))));
				pst.setString(2, dr.substring(dr.indexOf(",") + 1, dr.length()));
				isSave = pst.executeUpdate() > 0;
			}
		} catch (NumberFormatException | IOException | SQLException e2) {
			e2.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return isSave;
	}
}
