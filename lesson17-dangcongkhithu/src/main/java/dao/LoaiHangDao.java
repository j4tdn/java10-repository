package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.LoaiHang;



public class LoaiHangDao {

	private Connection connection = DBConnection.getConnection();;
	private Statement stm;
	private ResultSet rs;

	public List<LoaiHang> selectByIdCategory(Integer idCategory) {
		List<LoaiHang> listCategorys = new ArrayList<>();
		try {
			stm = connection.createStatement();
			rs = stm.executeQuery("select * from LoaiHang where maLoai =" + idCategory + "");
			while (rs.next()) {
				LoaiHang CategoryGroup = new LoaiHang(rs.getInt("maLoai"), rs.getString("tenLoai"));
				listCategorys.add(CategoryGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stm.close();
				rs.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
		}
		return listCategorys;
	}

	public List<LoaiHang> selectByNameCategory(String nameCategory) {
		List<LoaiHang> listCategorys = new ArrayList<>();
		try {
			stm = connection.createStatement();
			rs = stm.executeQuery("select * from LoaiHang where tenLoai like '%" + nameCategory + "'");
			while (rs.next()) {
				LoaiHang CategoryGroup = new LoaiHang(rs.getInt("maLoai"), rs.getString("tenLoai"));
				listCategorys.add(CategoryGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stm.close();
				rs.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
		}
		return listCategorys;
	}
}
