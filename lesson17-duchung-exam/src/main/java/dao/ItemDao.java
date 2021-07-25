package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Items;
import persistence.ItemsDto;

public class ItemDao {
	private Connection connection;
	private java.sql.Statement st = null;
	private java.sql.PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemDao() {
		connection = DbConnection.getConnection();
	}

	// Câu 3: 13đ
	public List<Items> getItems() {
		List<Items> listItems = new ArrayList<>();
		String sql = "SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang,sum(ctdh.soluong) as TongSoLuong\r\n"
				+ "FROM MatHang mh  JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH JOIN DonHang dh ON dh.MaDH = ctdh.MaDH \r\n"
				+ "WHERE Year(dh.ThoiGianDatHang) = 2020\r\n" + "GROUP BY mh.maMH\r\n" + "ORDER BY TongSoLuong DESC\r\n"
				+ "LIMIT 3;\r\n" + "";

		try {
			// A có nhắc là a để 2020 và TOP 3 là dễ hiểu đề
			// Còn những giá trị đó phải là tham số truyền vào
			// Và khi có tham số truyền vào thì nên dùng PrepareStatement để avoid SQL Injection
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				// Đề chỉ yêu cầu trả về TenMH nên e cũng ko cần phải SELECT ra 4 thuộc tính như trên câu SQL
				// JAVA chỉ cần trả về List<String> Ko cần tạo Items chứa String thừa
				Items item = new Items(rs.getString("tenMH"));
				listItems.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return listItems;
	}

	// Câu 4: Em làm cho câu 4 đúng ko ?? 15đ
	// Câu 4 thì liệt kê hết nên ko cần GROUP BY
	public List<ItemsDto> getItemsOfGroupId() {
		List<ItemsDto> listItems = new ArrayList<>();
		String sql = "SELECT lh.maLoai, lh.TenLoai, mh.maMH, mh.TenMH, mh.GiaBan, mh.GiaMua,\r\n"
				+ "		SUM(kcmh.SoLuong) as SoLuong\r\n" + "FROM MatHang mh\r\n" + "JOIN LoaiHang lh\r\n"
				+ "	ON mh.MaLoai = lh.MaLoai\r\n" + "JOIN KichCoMatHang kcmh\r\n" + "	ON mh.MaMH = kcmh.MaMH\r\n"
				+ "GROUP BY mh.maLoai,mh.maMH";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemsDto item = new ItemsDto(rs.getInt("maLoai"), rs.getString("tenLoai"), rs.getInt("maMH"),
						rs.getString("tenMH"), rs.getInt("giaBan"), rs.getInt("giaMua"), rs.getInt("SoLuong"));
				listItems.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return listItems;
	}
	
	// Câu 1: 25đ
	public List<ItemsDto> getItems(LocalDate salesDate) {
		List<ItemsDto> listItems = new ArrayList<>();
		String sql = "SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang FROM MatHang mh "
				+ " JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH JOIN DonHang dh"
				// Tương tự câu hỏi trong bài của Quốc 
				// https://github.com/j4tdn/java10-repository/commit/aa4934c144fc549ad8dd21249bf535f948595684
				// Dùng DATE(..) có ép kiểu dc ko. A ko chạy thử. Các bạn chạy rồi answer giúp a
				// Có same với CAST(dh.ThoiGianDatHang as DATE) không
				+ " ON dh.MaDH = ctdh.MaDH WHERE DATE(dh.ThoiGianDatHang) = ?";

		try {
			pst = connection.prepareStatement(sql);
			pst.setDate(1, Date.valueOf(salesDate));
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemsDto item = new ItemsDto(rs.getInt("maMH"), rs.getString("tenMH"), rs.getTime("ThoiGianDatHang"));
				listItems.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return listItems;
	}
}
