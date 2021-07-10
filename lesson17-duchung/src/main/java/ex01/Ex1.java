package ex01;

import static utils.Utils.print;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.LoaiHang;
import connection.DbConnection;

public class Ex1 {
	private static Connection connection = DbConnection.getConnection();

	public static void main(String[] args) {
		System.out.println("1.1  Liệt kê theo MaLoai ");
		List<LoaiHang> selectByIdCategory = selectByIdCategory(5);
		print(selectByIdCategory);
		System.out.println("1.2 Liệt kê theo TenLoai");
		List<LoaiHang> selectByNameCategory = selectByNameCategory("Ao");
		print(selectByNameCategory);
	}

	private static List<LoaiHang> selectByIdCategory(Integer idCategory) {
		List<LoaiHang> listCategorys = new ArrayList<>();
		try {
			Statement selectStmt = connection.createStatement();
			ResultSet rs = selectStmt.executeQuery("SELECT * FROM loaihang WHERE maloai =" + idCategory + " ");
			while (rs.next()) {
				LoaiHang CategoryGroup = new LoaiHang(rs.getInt("maloai"), rs.getString("tenloai"));
				listCategorys.add(CategoryGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCategorys;
	}

	private static List<LoaiHang> selectByNameCategory(String nameCategory) {
		List<LoaiHang> listCategorys = new ArrayList<>();
		try {
			Statement selectStmt = connection.createStatement();
			ResultSet rs = selectStmt
					.executeQuery("SELECT * FROM loaihang WHERE tenloai like '%" + nameCategory + "' ");
			while (rs.next()) {
				LoaiHang CategoryGroup = new LoaiHang(rs.getInt("maloai"), rs.getString("tenloai"));
				listCategorys.add(CategoryGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCategorys;
	}

}
