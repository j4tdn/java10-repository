package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.MatHang;

public class MatHangDao {

	private Connection connection = DBConnection.getConnection();;
	private Statement stm;
	private ResultSet rs;

	public List<MatHang> listitems(Integer idCategory, int saleIn, int saleOut) {
		List<MatHang> listCommodity = new ArrayList<>();
		try {
			stm = connection.createStatement();
			rs = stm.executeQuery("select * from mathang where maloai = " + idCategory + " and giaBan between "
					+ saleIn + " and " + saleOut + "");
			while (rs.next()) {
				MatHang Items = new MatHang(rs.getInt("maMH"), rs.getString("tenMH"), rs.getDouble("giaBan"),
						rs.getDouble("giaMua"), rs.getInt("maLoai"), null);
				listCommodity.add(Items);
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
		return listCommodity;
	}
}
