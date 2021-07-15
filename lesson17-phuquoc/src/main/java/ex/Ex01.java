package ex;

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

		System.out.println("Liệt kê toàn bộ thông tin các loại hàng trong hệ thống");
		utils.Util.print(selectAllCategory());
		System.out.println("===================================");

		System.out.println("Liệt kê theo MaLoai");
		utils.Util.print(selectByIdCategory(2));
		System.out.println("===================================");

		System.out.println("Liệt kê theo TenLoai");
		utils.Util.print(selectByNameCategory("Ao"));
	}

	private static List<LoaiHang> selectAllCategory() {
		List<LoaiHang> listCategorys = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from loaihang");
			while (resultset.next()) {
				LoaiHang Items = new LoaiHang(resultset.getInt("maLoai"), resultset.getString("tenLoai"));
				listCategorys.add(Items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCategorys;
	}

	private static List<LoaiHang> selectByIdCategory(Integer idCategory) {
		List<LoaiHang> listByIdCategorys = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from loaihang where maloai =" + idCategory + " ");
			while (resultset.next()) {
				LoaiHang Items = new LoaiHang(resultset.getInt("maLoai"), resultset.getString("tenLoai"));
				listByIdCategorys.add(Items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listByIdCategorys;
	}

	private static List<LoaiHang> selectByNameCategory(String nameCategory) {
		List<LoaiHang> listByNameCategorys = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultset = statement
					.executeQuery("select * from loaihang where tenloai like '%" + nameCategory + "' ");
			while (resultset.next()) {
				LoaiHang Items = new LoaiHang(resultset.getInt("maLoai"), resultset.getString("tenLoai"));
				listByNameCategorys.add(Items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listByNameCategorys;
	}

}