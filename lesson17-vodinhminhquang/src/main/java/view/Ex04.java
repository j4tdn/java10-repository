package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import connection.DbConnection;
import entity.Bill;

public class Ex04 {
	
	public static void main(String[] args) {
		System.out.println(getBills(1).toString());;
	}
	
	private static Bill getBills(int billId){
		Bill billDetail = new Bill();
		try {
			String sql = "SELECT ctdh.MaDH, sum(mh.GiaBan * ctdh.SoLuong) AS Total FROM mathang mh\r\n"
					+ "JOIN chitietdonhang ctdh\r\n"
					+ "ON mh.MaMH = ctdh.MaMH\r\n"
					+ "WHERE ctdh.MaDH = '" + billId + "'\r\n";
			Connection connection = DbConnection.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int MaDh = rs.getInt(1);
				int total = rs.getInt(2);
				
				billDetail.setMaDh(MaDh);
				billDetail.setTotal(total);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return billDetail;
	}
}
