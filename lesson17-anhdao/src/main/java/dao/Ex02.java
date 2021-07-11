package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;

public class Ex02 {
	public List<Item> getItem02(int itemGroupId, double saleFrom, double saleTo) {
		List<Item> result = new ArrayList<>();

	// 2. Liệt kê các mặt hàng theo mã loại và giá bán trung bình từ 100 đến 500 trong hệ thống
//+ Theo TenLoai
//ItemGroup: id, name
//Item: id, name, saleIn, saleOut

		String sql = "SELECT*FROM MatHang WHERE Maloai = "+ itemGroupId + "AND GiaBan BETWEN" + saleFrom + "AND" + saleTo+ "";

		Connection connection = DbConnection.getConnection();

		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Item item = new Item(rs.getInt("idItem"), rs.getString("nameItem"), rs.getDouble("saleOut"),
						rs.getDouble("saleIn"), rs.getInt("IdGroupItem"), null);
				
				result.add(item);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}
}
