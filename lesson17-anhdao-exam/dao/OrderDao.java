package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.DbConnection;
import persistence.ItemGroup;
import utils.SqlUtils;

public class OrderDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public OrderDao() {
	}
	public boolean UpDateMoney(double totalOfMoney, int idOrder) {
		boolean isUpDate = false;
		String sql = 
				"update donhang \n" 
				+"set Tongtien = ?\n"  
				+"WHERE  madh = ?";
		 conn = DbConnection.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setDouble(1, totalOfMoney);
			pst.setInt(2, idOrder);
			isUpDate = pst.executeUpdate()>0;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return isUpDate;
	}
}
