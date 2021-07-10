package exercises;

import static utils.Utils.print;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.LoaiHang;
import connection.DbConnection;

public class Ex01 {
	private static Connection connection = DbConnection.getConnection();

	public static void main(String[] args) {
		System.out.println("+ Liệt kê theo MaLoai ");
		List<LoaiHang> selectByIdCategory = selectByIdCategory(1);
		print(selectByIdCategory);
		System.out.println("+ Liệt kê theo TenLoai");
		List<LoaiHang> selectByNameCategory = selectByNameCategory("Quan");
		print(selectByNameCategory);
	}

	private static List<LoaiHang> selectByIdCategory(Integer idCategory) {
		List<LoaiHang> listCategorys = new ArrayList<>();
		try {
			Statement selectStmt = connection.createStatement();
			ResultSet rs = selectStmt.executeQuery("select * from LoaiHang where maLoai =" + idCategory + "");
			while (rs.next()) {
				LoaiHang CategoryGroup = new LoaiHang(rs.getInt("maLoai"), rs.getString("tenLoai"));
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
			ResultSet rs = selectStmt.executeQuery("select * from LoaiHang where tenLoai like '%" + nameCategory + "'");
			while (rs.next()) {
				LoaiHang CategoryGroup = new LoaiHang(rs.getInt("maLoai"), rs.getString("tenLoai"));
				listCategorys.add(CategoryGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCategorys;
	}
}
