package exercises;

import static utils.Utils.print;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.LoaiHang;

public class Ex01 {
	private static Connection connection = DbConnection.getConnection();

	public static void main(String[] args) {
		System.out.println("1.1  Liệt kê theo MaLoai ");
		List<LoaiHang> selectByIdCategory = selectByIdCategory(3);
		print(selectByIdCategory);
		System.out.println("1.2 Liệt kê theo TenLoai");
		List<LoaiHang> selectByNameCategory = selectByNameCategory("Quan");
		print(selectByNameCategory);
	}

	private static List<LoaiHang> selectByIdCategory(Integer idCategory) {
		List<LoaiHang> reslt = new ArrayList<>();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM loaihang WHERE maloai =" + idCategory + " ");
			while (rs.next()) {
				LoaiHang CategoryGroup = new LoaiHang(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				reslt.add(CategoryGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reslt;
	}

	private static List<LoaiHang> selectByNameCategory(String nameCategory) {
		List<LoaiHang> reslt = new ArrayList<>();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM loaihang WHERE tenloai like '%" + nameCategory + "' ");
			while (rs.next()) {
				LoaiHang CategoryGroup = new LoaiHang(rs.getInt("MaLoai"), rs.getString("TenLoai"));
				reslt.add(CategoryGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reslt;
	}
}